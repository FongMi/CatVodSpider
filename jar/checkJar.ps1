param(
    [string] $Jar = (Join-Path $PSScriptRoot "custom_spider.jar"),
    [string] $Sdk = (Join-Path $PSScriptRoot "..\app\libs\catvod-api.jar"),
    [string] $Apk = (Join-Path $PSScriptRoot "..\app\build\outputs\apk\release\app-release-unsigned.apk")
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

function GetDexHeaders([string] $Path) {
    $archive = [IO.Compression.ZipFile]::OpenRead((Resolve-Path -LiteralPath $Path).Path)
    try {
        foreach ($entry in $archive.Entries | Where-Object { $_.FullName -match '^classes[0-9]*\.dex$' } | Sort-Object FullName) {
            $reader = [IO.BinaryReader]::new($entry.Open())
            try {
                $header = $reader.ReadBytes(8)
                if ($header.Length -ne 8) { Fail "truncated DEX header: $($entry.FullName)" }
                "$($entry.FullName):$([BitConverter]::ToString($header))"
            } finally {
                $reader.Dispose()
            }
        }
    } finally {
        $archive.Dispose()
    }
}

$apktool = Join-Path $PSScriptRoot "3rd\apktool_2.11.0.jar"
if (-not (Test-Path -LiteralPath $Jar)) { Fail "missing jar: $Jar" }
if (-not (Test-Path -LiteralPath $apktool)) { Fail "missing apktool: $apktool" }
if (-not (Test-Path -LiteralPath $Sdk)) { Fail "missing SDK: $Sdk" }
if (-not (Test-Path -LiteralPath $Apk)) { Fail "missing release APK: $Apk" }

Add-Type -AssemblyName System.IO.Compression.FileSystem
$apkHeaders = @(GetDexHeaders $Apk)
$jarHeaders = @(GetDexHeaders $Jar)
if ($apkHeaders.Count -eq 0) { Fail "missing release DEX" }
if (($apkHeaders -join ',') -ne ($jarHeaders -join ',')) { Fail "DEX names or versions differ from release APK" }

$sdkClasses = [Collections.Generic.HashSet[string]]::new()
$sdkArchive = [IO.Compression.ZipFile]::OpenRead((Resolve-Path -LiteralPath $Sdk).Path)
try {
    foreach ($entry in $sdkArchive.Entries) {
        if ($entry.FullName.EndsWith('.class')) { [void] $sdkClasses.Add($entry.FullName.Substring(0, $entry.FullName.Length - 6)) }
    }
} finally {
    $sdkArchive.Dispose()
}

$Jar = (Resolve-Path -LiteralPath $Jar).Path
$size = (Get-Item -LiteralPath $Jar).Length

$md5Path = "$Jar.md5"
if (-not (Test-Path -LiteralPath $md5Path)) { Fail "missing md5: $md5Path" }
$md5 = [Security.Cryptography.MD5]::Create()
try {
    $actualMd5 = [BitConverter]::ToString($md5.ComputeHash([IO.File]::ReadAllBytes($Jar))).Replace("-", "").ToLowerInvariant()
} finally {
    $md5.Dispose()
}
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
    $hostClasses = @("androidx/core/content/FileProvider")
    foreach ($def in $defs) {
        if ($sdkClasses.Contains($def)) { Fail "SDK class packaged in spider JAR: $def" }
    }
    $missing = foreach ($ref in $refs) {
        if (-not $defs.Contains($ref) -and -not $sdkClasses.Contains($ref) -and $ref -notin $hostClasses -and -not (StartsWithAny $ref $allowed) -and -not (StartsWithAny $ref $optional)) {
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
        if ([IO.Path]::GetDirectoryName([IO.Path]::GetFullPath($work)) -ne [IO.Path]::GetTempPath().TrimEnd('\')) { throw "Unexpected temporary directory: $work" }
        Remove-Item -LiteralPath $work -Recurse -Force
    }
}
