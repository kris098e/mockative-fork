#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

number=${1}

(cd $gitRoot; ./gradlew clean)
sleep 2
{
    time {
      (cd $gitRoot; ./gradlew :compare-mockativeTests:cleanIosTest :compare-mockativeTests:iosTest --tests "myTests.MockHelloClasses$number.stubbing") 2>&1
    }
} 2>> $number/time_ios_Test_stubbing$number.txt

