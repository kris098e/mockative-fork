#!/bin/bash
gitRoot="$(git rev-parse --show-toplevel)"

time {
  (cd $gitRoot; ./gradlew :compare-mockKTests:cleanJvmTest :compare-mockKTests:jvmTest --tests "myTests.MockHelloClasses.stubbing")
}
