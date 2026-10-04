@echo off
setlocal

if "%~1"=="" (
    call "%~dp0gradlew.bat" -p "%~dp0." spiderJar --no-daemon
) else (
    call "%~dp0gradlew.bat" -p "%~dp0." spiderJar "-PspiderOutput=%~f1" --no-daemon
)

exit /b %errorlevel%
