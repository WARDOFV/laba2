#!/usr/bin/env bash
set -e

rm -rf out
mkdir -p out

find src -name "*.java" > sources.txt
javac -d out @sources.txt

jar --create --file lab2.jar --manifest manifest.mf -C out .
rm sources.txt

echo "Собрано: lab2.jar"
echo "Запуск: java -jar lab2.jar"