@echo off
setlocal

set "DIR=%~dp0"
set "APK=%DIR%..\app\build\outputs\apk\release\app-release-unsigned.apk"
set "WORK=%DIR%Smali_classes"
set "SPIDER=%DIR%spider.jar"
set "OUT=%DIR%custom_spider.jar"
set "MD5=%OUT%.md5"

if not exist "%APK%" (
    echo Missing APK: "%APK%"
    exit /b 1
)

if exist "%OUT%" del /f /q "%OUT%"
if exist "%MD5%" del /f /q "%MD5%"
call :rmdir "%WORK%"
if errorlevel 1 exit /b %errorlevel%

java -jar "%DIR%3rd\apktool_2.11.0.jar" d -f --only-main-classes "%APK%" -o "%WORK%"
if errorlevel 1 exit /b %errorlevel%

call :rmdir "%SPIDER%\smali\com\github\catvod\spider"
if errorlevel 1 exit /b %errorlevel%
call :rmdir "%SPIDER%\smali\com\github\catvod\js"
if errorlevel 1 exit /b %errorlevel%

if not exist "%SPIDER%\smali\com\github\catvod" md "%SPIDER%\smali\com\github\catvod"

move "%WORK%\smali\com\github\catvod\spider" "%SPIDER%\smali\com\github\catvod\"
if errorlevel 1 exit /b %errorlevel%
move "%WORK%\smali\com\github\catvod\js" "%SPIDER%\smali\com\github\catvod\"
if errorlevel 1 exit /b %errorlevel%

java -jar "%DIR%3rd\apktool_2.11.0.jar" b "%SPIDER%" -c
if errorlevel 1 exit /b %errorlevel%

move /y "%SPIDER%\dist\dex.jar" "%OUT%"
if errorlevel 1 exit /b %errorlevel%

certUtil -hashfile "%OUT%" MD5 | find /i /v "md5" | find /i /v "certutil" > "%MD5%"
if not exist "%MD5%" exit /b 1

if not "%~1"=="" call :export "%~1"
if errorlevel 1 exit /b %errorlevel%

call :rmdir "%SPIDER%\build"
if errorlevel 1 exit /b %errorlevel%
call :rmdir "%SPIDER%\smali"
if errorlevel 1 exit /b %errorlevel%
call :rmdir "%SPIDER%\dist"
if errorlevel 1 exit /b %errorlevel%
call :rmdir "%WORK%"
if errorlevel 1 exit /b %errorlevel%

exit /b 0

:export
set "TARGET=%~f1"
if /i "%~x1"==".jar" (
    set "TARGET_JAR=%TARGET%"
) else (
    if not exist "%TARGET%" md "%TARGET%"
    set "TARGET_JAR=%TARGET%\custom_spider.jar"
)
copy /y "%OUT%" "%TARGET_JAR%"
if errorlevel 1 exit /b %errorlevel%
copy /y "%MD5%" "%TARGET_JAR%.md5"
if errorlevel 1 exit /b %errorlevel%
exit /b 0

:rmdir
if not exist "%~1" exit /b 0
for /l %%I in (1,1,5) do (
    rd /s /q "%~1" 2>nul
    if not exist "%~1" exit /b 0
    powershell -NoProfile -Command "Start-Sleep -Seconds 1" >nul
)
echo Failed to remove "%~1"
exit /b 1
