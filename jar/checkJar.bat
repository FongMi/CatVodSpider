@echo off
setlocal

powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0checkJar.ps1" %*
exit /b %errorlevel%
