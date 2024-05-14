#!/bin/bash

#bash generateAlotOfMocks.sh 32
#bash callBuild.sh 32
#bash callStubbing.sh 32
#rm myTests/MockHelloClasses32.kt
#
#
#bash generateAlotOfMocks.sh 64
#bash callBuild.sh 64
#bash callStubbing.sh 64
#rm myTests/MockHelloClasses64.kt
#
#bash generateAlotOfMocks.sh 128
#bash callBuild.sh 128
#bash callStubbing.sh 128
#rm myTests/MockHelloClasses128.kt
#
#bash generateAlotOfMocks.sh 256
#bash callBuild.sh 256
#bash callStubbing.sh 256
#rm myTests/MockHelloClasses256.kt
#
#bash generateAlotOfMocks.sh 512
#bash callBuild.sh 512
#bash callStubbing.sh 512
#rm myTests/MockHelloClasses512.kt

#bash callStubbing.sh 1024
gitRoot="$(git rev-parse --show-toplevel)"

#
###### METHOD MOCKS #####
#
#(cd $gitRoot; bash compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/classesWithManyFunctions.sh 4096)
#bash generateMethodMocks.sh 4096
#bash callBuild.sh 4096 "method"
#rm myTests/MockHelloClasses4096.kt
#(cd $gitRoot; bash rm compare-testClasses/src/commonMain/kotlin/compare/frameworks/classesHelloClassMethods4096.kt)
#
#(cd $gitRoot; bash compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/classesWithManyFunctions.sh 8192)
#bash generateMethodMocks.sh 8192
#bash callBuild.sh 8192 "method"
#rm myTests/MockHelloClasses8192.kt
#(cd $gitRoot; bash rm compare-testClasses/src/commonMain/kotlin/compare/frameworks/classesHelloClassMethods8192.kt)
#
#(cd $gitRoot; bash compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/classesWithManyFunctions.sh 16384)
#bash generateMethodMocks.sh 16384
#bash callBuild.sh 16384 "method"
#rm myTests/MockHelloClasses16384.kt
#(cd $gitRoot; bash rm compare-testClasses/src/commonMain/kotlin/compare/frameworks/classesHelloClassMethods16384.kt)

(cd $gitRoot; bash compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/classesWithManyFunctions.sh 32768)
bash generateMethodMocks.sh 32768
bash callBuild.sh 32768 "method"
rm myTests/MockHelloClasses32768.kt
(cd $gitRoot; bash rm compare-testClasses/src/commonMain/kotlin/compare/frameworks/classesHelloClassMethods32768.kt)

(cd $gitRoot; bash compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/classesWithManyFunctions.sh 65536)
bash generateMethodMocks.sh 65536
bash callBuild.sh 65536 "method"
rm myTests/MockHelloClasses65536.kt
(cd $gitRoot; bash rm compare-testClasses/src/commonMain/kotlin/compare/frameworks/classesHelloClassMethods65536.kt)
