#!/bin/bash

echo "."
read -p "UPDATE THE VERSION NUMBER before you hit ENTER"
echo "."

./sbt "+ compile" && ./sbt "+ publishSigned" && ./sbt sonatypeReleaseAll