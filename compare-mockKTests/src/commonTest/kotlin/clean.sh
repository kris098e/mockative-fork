#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

(cd $gitRoot; ./gradlew clean)