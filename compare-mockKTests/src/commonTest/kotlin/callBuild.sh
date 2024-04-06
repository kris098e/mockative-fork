#!/bin/bash

number=${1}
suffix=${2:-""}

for i in {1..15}
do
    bash testBuildTime.sh $number $suffix
    sleep 5
done