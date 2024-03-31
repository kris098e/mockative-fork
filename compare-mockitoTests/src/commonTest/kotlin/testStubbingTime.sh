#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

time {
  (cd $gitRoot; ./gradlew :compare-mockitoTests:cleanJvmTest :compare-mockitoTests:jvmTest --tests "myTests.MockHelloClasses.stubbing")
}