@echo off

call "%~dp0gradlew.bat" assembleRelease --no-daemon
if errorlevel 1 exit /b %errorlevel%

call "%~dp0jar\genJar.bat" %*
if errorlevel 1 exit /b %errorlevel%

call "%~dp0jar\checkJar.bat"
if errorlevel 1 exit /b %errorlevel%

exit /b 0
