#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

number=${1}

(cd $gitRoot; ./gradlew clean)
sleep 2
{
    time {
      (cd $gitRoot; ./gradlew :compare-mockitoTests:cleanJvmTest :compare-mockitoTests:jvmTest --tests "myTests.MockHelloClasses$number.stubbing") 2>&1
    }
} 2>> $number/stubbing$number.txt
