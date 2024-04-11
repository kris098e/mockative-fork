#!/bin/bash
#
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

bash generateAlotOfMocks.sh 1024
bash callStubbing.sh 1024
rm myTests/MockHelloClasses1024.kt


##### METHOD MOCKS #####
#bash generateMethodMocks.sh 32
#bash callBuild.sh 32 "method"
#rm myTests/MockHelloClasses32.kt
#
#bash generateMethodMocks.sh 64
#bash callBuild.sh 64 "method"
#rm myTests/MockHelloClasses64.kt
#
#bash generateMethodMocks.sh 128
#bash callBuild.sh 128 "method"
#rm myTests/MockHelloClasses128.kt
#
#bash generateMethodMocks.sh 256
#bash callBuild.sh 256 "method"
#rm myTests/MockHelloClasses256.kt
#
#bash generateMethodMocks.sh 512
#bash callBuild.sh 512 "method"
#rm myTests/MockHelloClasses512.kt

