#!/bin/bash

# Define the output file
output_file="./AlotOfClasses.kt"

# Create the directory if it doesn't exist
mkdir -p $(dirname $output_file)

# Start the file with the package name
echo "package compare.frameworks.classes" > $output_file
echo "" >> $output_file
echo "import compare.frameworks.annotations.MockativeMockable" >> $output_file
echo "" >> $output_file

echo "interface HelloClass {" >> $output_file
echo "    fun sayHello(name: String): String" >> $output_file
echo "}" >> $output_file

# Append all classes to the same file
for i in {1..400}
do
echo "@MockativeMockable" >> $output_file
echo "class HelloClass${i}: HelloClass {" >> $output_file
echo "    override fun sayHello(name: String): String {" >> $output_file
echo "        return \"Hello, World! from \$name\"" >> $output_file
echo "    }" >> $output_file
echo "}" >> $output_file
echo "" >> $output_file
done

echo "The file AlotOfClasses.kt has been generated."
