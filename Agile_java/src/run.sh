#!/bin/bash
javac -cp ~/JavaTDD/junit-4.12.jar *.java
if [ $? -eq 0 ]; then
  java -cp .:$HOME/JavaTDD/junit-4.12.jar junit.textui.TestRunner $1
fi
