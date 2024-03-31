#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

time {
  (cd $gitRoot; ./gradlew :compare-mockativeTests:cleanIosTest :compare-mockativeTests:iosTest --tests "myTests.MockHelloClasses.stubbing")
}