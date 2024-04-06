#!/bin/bash

number=${1}

# Define the output file
mocks_output_file="./myTests/MockHelloClasses$number.kt"

# Create the directory if it doesn't exist
mkdir -p $(dirname $mocks_output_file)

# Start the file with the package name and imports
echo "package myTests" > $mocks_output_file
echo "" >> $mocks_output_file
echo "
import compare.frameworks.classes.*
import io.mockk.*
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals
" >> $mocks_output_file

echo "" >> $mocks_output_file
echo "class MockHelloClasses$number {" >> $mocks_output_file
# Append the mock initializations to the same file
for i in $(seq 1 $number)
do
echo "val mock${i}: HelloClassMethods${i} = mockk()" >> $mocks_output_file
done

echo "val mocks = listOf<HelloClassMethods>(" >> $mocks_output_file
for i in $(seq 1 $number)
do
echo "mock${i}," >> $mocks_output_file
done
echo ")" >> $mocks_output_file

echo "
    @Test
    fun passingTest() {
        Assert.assertTrue(true)
    }
" >> $mocks_output_file

echo "}" >> $mocks_output_file

echo "The file MockHelloClasses.kt has been generated."
