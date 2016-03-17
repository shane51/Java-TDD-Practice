#!/bin/bash
# cd studentinfo
javac -cp .:$HOME/JavaTDD/junit-4.12.jar -Xlint:deprecation */*/*.java
if [ $? -eq 0 ]; then
  java -cp .:$HOME/JavaTDD/junit-4.12.jar junit.textui.TestRunner $1.$2
fi
