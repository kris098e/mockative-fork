#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

time {
  (cd $gitRoot; ./gradlew :compare-mockativeTests:cleanJvmTest :compare-mockativeTests:jvmTest --tests "myTests.MockHelloClasses.stubbing")
}