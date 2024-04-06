#!/bin/bash

number=${1}
for i in {1..15}
do
  (cd ..; bash jsNodeTestBuildTime.sh $number)
  sleep 5
done
