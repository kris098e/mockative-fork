#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

#(cd $gitRoot; ./gradlew clean)
#sleep 2
time {
  (cd $gitRoot; ./gradlew :compare-mockativeTests:cleanJvmTest :compare-mockativeTests:jvmTest --tests "myTests.MockHelloClasses.passingTest")
}