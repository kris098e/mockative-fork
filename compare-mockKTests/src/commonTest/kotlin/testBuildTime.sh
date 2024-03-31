#!/bin/bash
gitRoot="$(git rev-parse --show-toplevel)"

(cd $gitRoot; ./gradlew clean)

sleep 2
time {
  (cd $gitRoot; ./gradlew :compare-mockKTests:cleanJvmTest :compare-mockKTests:jvmTest --tests "myTests.MockHelloClasses.pass")
}
