param(
    [string] $Jar = (Join-Path $PSScriptRoot "custom_spider.jar")
)

$ErrorActionPreference = "Stop"

function Fail([string] $Message) {
    Write-Host "FAIL $Message"
    exit 1
}

function StartsWithAny([string] $Value, [string[]] $Prefixes) {
    foreach ($prefix in $Prefixes) {
        if ($Value.StartsWith($prefix, [StringComparison]::Ordinal)) {
            return $true
        }
    }
    return $false
}

$apktool = Join-Path $PSScriptRoot "3rd\apktool_2.11.0.jar"
if (-not (Test-Path -LiteralPath $Jar)) { Fail "missing jar: $Jar" }
if (-not (Test-Path -LiteralPath $apktool)) { Fail "missing apktool: $apktool" }

$Jar = (Resolve-Path -LiteralPath $Jar).Path
$size = (Get-Item -LiteralPath $Jar).Length

$md5Path = "$Jar.md5"
if (-not (Test-Path -LiteralPath $md5Path)) { Fail "missing md5: $md5Path" }
$actualMd5 = (Get-FileHash -Algorithm MD5 -LiteralPath $Jar).Hash.ToLowerInvariant()
$expectedMd5 = (Get-Content -Raw -LiteralPath $md5Path).Trim().ToLowerInvariant()
if ($actualMd5 -ne $expectedMd5) { Fail "md5 mismatch: $actualMd5 != $expectedMd5" }

$work = Join-Path ([IO.Path]::GetTempPath()) ("catvod-checkJar-" + [Guid]::NewGuid().ToString("N"))
try {
    & java -jar $apktool d -f $Jar -o $work | Out-Null
    if ($LASTEXITCODE -ne 0) { Fail "apktool decode failed" }

    $smali = Join-Path $work "smali"
    if (-not (Test-Path -LiteralPath $smali)) { Fail "missing smali output" }

    foreach ($path in @("androidx", "kotlin", "javax\xml\namespace", "org\slf4j", "org\xmlpull\v1")) {
        if (Test-Path -LiteralPath (Join-Path $smali $path)) { Fail "unexpected packaged API: $path" }
    }

    $catvod = Join-Path $smali "com\github\catvod"
    if (-not (Test-Path -LiteralPath $catvod)) { Fail "missing catvod package" }
    $unexpected = Get-ChildItem -Force -LiteralPath $catvod | Where-Object {
        $_.Name -notin @("js", "spider")
    }
    if ($unexpected) { Fail ("unexpected catvod entries: " + (($unexpected.Name | Sort-Object) -join ", ")) }

    $defs = [Collections.Generic.HashSet[string]]::new()
    $refs = [Collections.Generic.HashSet[string]]::new()
    $classPattern = '(?m)^\.class[ \t]+(?:[^ \t\r\n]+[ \t]+)*L([^;\r\n]+);'
    $typePattern = '(?<![A-Za-z0-9_$])L([A-Za-z_$][A-Za-z0-9_$]*(?:/[A-Za-z_$][A-Za-z0-9_$]*)+(?:\$[A-Za-z0-9_$]+)?);'
    $forbiddenText = [ordered]@{
        "Lcom/google/gson/reflect/TypeToken;-><init>()V" = "illegal Gson TypeToken constructor call; use TypeToken.getParameterized"
    }

    foreach ($file in Get-ChildItem -Recurse -Filter "*.smali" -LiteralPath $smali) {
        $text = Get-Content -Raw -LiteralPath $file.FullName
        foreach ($pattern in $forbiddenText.Keys) {
            if ($text.Contains($pattern)) {
                Fail "$($forbiddenText[$pattern]): $($file.FullName)"
            }
        }
        foreach ($match in [regex]::Matches($text, $classPattern)) { [void] $defs.Add($match.Groups[1].Value) }
        foreach ($match in [regex]::Matches($text, $typePattern)) { [void] $refs.Add($match.Groups[1].Value) }
    }

    $allowed = @(
        "android/",
        "androidx/annotation/",
        "androidx/startup/",
        "androidx/tracing/",
        "com/github/catvod/crawler/",
        "com/google/gson/",
        "com/hierynomus/",
        "com/thegrizzlylabs/sardineandroid/",
        "com/whl/quickjs/",
        "dalvik/",
        "j$/",
        "java/",
        "javax/crypto/",
        "javax/net/",
        "javax/security/",
        "javax/xml/namespace/",
        "okhttp3/",
        "okio/",
        "org/json/",
        "org/slf4j/",
        "org/w3c/dom/",
        "org/xml/sax/",
        "org/xmlpull/v1/",
        "kotlin/"
    )
    # jsoup can reference re2j as an optional regex backend; the jar does not require it.
    $optional = @("com/google/re2j/")
    $missing = foreach ($ref in $refs) {
        if (-not $defs.Contains($ref) -and -not (StartsWithAny $ref $allowed) -and -not (StartsWithAny $ref $optional)) {
            $ref
        }
    }
    if ($missing) { Fail ("missing refs: " + (($missing | Sort-Object -Unique | Select-Object -First 20) -join ", ")) }

    $optionalRefs = foreach ($ref in $refs) {
        if (-not $defs.Contains($ref) -and (StartsWithAny $ref $optional)) {
            $ref
        }
    }
    if ($optionalRefs) {
        Write-Host ("WARN optional refs (jsoup optional regex backend): " + (($optionalRefs | Sort-Object -Unique) -join ", "))
    }

    Write-Host "OK $([IO.Path]::GetFileName($Jar)) $size bytes $actualMd5"
} finally {
    if (Test-Path -LiteralPath $work) {
        Remove-Item -LiteralPath $work -Recurse -Force
    }
}
