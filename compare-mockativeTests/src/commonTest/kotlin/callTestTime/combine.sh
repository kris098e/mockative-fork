#!/bin/bash

number=256
# bash iosCallTestStubbingTime.sh $number
bash iosCallTestBuildTime.sh $number

#bash jsNodeCallTestStubbingTime.sh $number
bash jsNodeCallTestBuildTime.sh $number

bash jvmCallTestBuildTime.sh $number
#bash jvmCallTestStubbingTime.sh $number


#bash androidCallTestStubbingTime.sh $number
bash androidCallTestBuildTime.sh $number