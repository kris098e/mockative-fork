#!/bin/bash


gitRoot="$(git rev-parse --show-toplevel)"

number=${1}

(cd $gitRoot; ./gradlew clean)
sleep 2
{
    time {
      (cd $gitRoot; ./gradlew :compare-mockativeTests:cleanJvmTest :compare-mockativeTests:jvmTest --tests "myTests.MockHelloClasses$number.passingTest") 2>&1
    }
} 2>> $number/time_jvm_Test_build$number.txt
