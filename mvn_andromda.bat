@echo off
rem Backup the contents of pom.xml in pom.warGenerator.xml
echo F | xcopy pom.xml pom.warGenerator.xml /Y /F
echo F | xcopy common\pom.xml common\pom.warGenerator.xml /Y /F
echo F | xcopy core\pom.xml core\pom.warGenerator.xml /Y /F
echo F | xcopy web\pom.xml web\pom.warGenerator.xml /Y /F

rem Copy poms used for AndroMDA build - code generate.
xcopy pom.codeGenerator.xml pom.xml /Y /F
xcopy common\pom.codeGenerator.xml common\pom.xml /Y /F
xcopy core\pom.codeGenerator.xml core\pom.xml /Y /F
xcopy web\pom.codeGenerator.xml web\pom.xml /Y /F

rem Instead of the above clean&update method, use mvn_clean_service.bat
call mvn_clean_service.bat

rem Run a AndroMDA maven install
call mvn -f mda/pom.xml
rem call mvn -e install -Dmaven.test.skip=true

rem Restore the poms used for normal build.
xcopy pom.warGenerator.xml pom.xml /Y /F
xcopy common\pom.warGenerator.xml common\pom.xml /Y /F
xcopy core\pom.warGenerator.xml core\pom.xml /Y /F
xcopy web\pom.warGenerator.xml web\pom.xml /Y /F

rem Remove the temporary pom.warGenerator.xml backups
del pom.warGenerator.xml
del common\pom.warGenerator.xml
del core\pom.warGenerator.xml
del web\pom.warGenerator.xml

rem Revert some files that are still wrong generated by AndroMDA
call svn revert .classpath
call svn revert .project
:end