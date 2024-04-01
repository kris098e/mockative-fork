#!/bin/bash

# Define the output file
mocks_output_file="./myTests/MockHelloClasses.kt"

# Create the directory if it doesn't exist
mkdir -p $(dirname $mocks_output_file)

# Start the file with the package name and imports
echo "package myTests" > $mocks_output_file
echo "" >> $mocks_output_file

echo "import io.mockative.Mock" >> $mocks_output_file
echo "import io.mockative.classOf" >> $mocks_output_file
echo "import io.mockative.mock" >> $mocks_output_file

# Append imports and mocks to the same file
echo "import compare.frameworks.classes.*" >> $mocks_output_file

echo "" >> $mocks_output_file
echo "class MockHelloClasses {" >> $mocks_output_file
# Append the mock initializations to the same file
for i in {1..400}
do
echo "@Mock val mock${i}: HelloClass${i} = mock(classOf<HelloClass${i}>())" >> $mocks_output_file
done

echo "val mocks = listOf<HelloClass>(" >> $mocks_output_file
for i in {1..400}
do
echo "mock${i}," >> $mocks_output_file
done
echo ")" >> $mocks_output_file

echo "}" >> $mocks_output_file

echo "The file MockHelloClasses.kt has been generated."
