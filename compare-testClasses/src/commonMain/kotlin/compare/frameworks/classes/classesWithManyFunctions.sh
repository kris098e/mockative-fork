#!/bin/bash

# Define the output file
output_file="./AlotOfClassesWith100Methods.kt"

# Create the directory if it doesn't exist
mkdir -p $(dirname $output_file)

# Start the file with the package name
echo "package compare.frameworks.classes" > $output_file
echo "" >> $output_file
echo "import compare.frameworks.annotations.MockativeMockable" >> $output_file
echo "" >> $output_file

# Generate the interface with 100 methods
echo "interface HelloClassMethods {" >> $output_file
for methodIndex in {1..100}
do
    echo "    fun method$methodIndex(): String" >> $output_file
done
echo "}" >> $output_file
echo "" >> $output_file

# Append all classes to the same file, implementing the interface
for classIndex in {1..512}
do
    echo "@MockativeMockable" >> $output_file
    echo "class HelloClassMethods$classIndex: HelloClassMethods {" >> $output_file
    # Implement 100 methods per class
    for methodIndex in {1..100}
    do
        echo "    override fun method$methodIndex(): String {" >> $output_file
        echo "        return \"This is method $methodIndex in HelloClass$classIndex\"" >> $output_file
        echo "    }" >> $output_file
    done
    echo "}" >> $output_file
    echo "" >> $output_file
done

echo "The file $output_file has been generated with 128 classes, each implementing an interface with 100 methods."
