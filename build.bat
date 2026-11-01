@echo off
rmdir /s /q out 2>nul
mkdir out

dir /s /b src\*.java > sources.txt
javac -d out @sources.txt

jar --create --file lab2.jar --manifest manifest.mf -C out .
del sources.txt

echo Собрано: lab2.jar
echo Запуск: java -jar lab2.jar