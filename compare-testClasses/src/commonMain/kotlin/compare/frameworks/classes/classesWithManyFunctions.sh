#!/bin/bash

gitRoot="$(git rev-parse --show-toplevel)"

number=${1}
# Define the output file
output_file="$gitRoot/compare-testClasses/src/commonMain/kotlin/compare/frameworks/classes/HelloClassMethods$number.kt"

# Create the directory if it doesn't exist
mkdir -p $(dirname $output_file)

# Start the file with the package name
echo "package compare.frameworks.classes" > $output_file
echo "" >> $output_file
echo "import compare.frameworks.annotations.MockativeMockable" >> $output_file
echo "" >> $output_file

# Append all classes to the same file, implementing the interface
echo "@MockativeMockable" >> $output_file
echo "class HelloClassMethods$number{" >> $output_file
for methodIndex in $(seq 1 $number)
do
    echo "    fun method$methodIndex(): String {" >> $output_file
    echo "        return \"This is method $methodIndex in HelloClass$classIndex\"" >> $output_file
    echo "    }" >> $output_file
done
echo "}" >> $output_file
echo "" >> $output_file
