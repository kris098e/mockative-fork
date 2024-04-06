#!/bin/bash
gitRoot="$(git rev-parse --show-toplevel)"

(cd $gitRoot; ./gradlew clean)

number=${1}
suffix=${2:-""}

(cd $gitRoot; ./gradlew clean)
sleep 2
{
    time {
      (cd $gitRoot; ./gradlew :compare-mockKTests:cleanJvmTest :compare-mockKTests:jvmTest --tests "myTests.MockHelloClasses$number.passingTest") 2>&1
    }
} 2>> $number/build$suffix$number.txt
