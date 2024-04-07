import os
import numpy as np

def calculate_and_append_metrics(directory):
    for subdir, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(subdir, file)
            with open(file_path, 'r+') as f:
                times = [float(line.strip().split('m')[1].strip('s')) for line in f if line.startswith('real')]
                average = np.mean(times)
                variance = np.var(times)

                # Go to the end of the file to append the average and variance
                f.write(f'\n\nAverage: {average:.3f}s\nVariance: {variance:.3f}s\n')

# List of directories to process
directories = ['32', '64', '128', '256', '512']
for directory in directories:
    calculate_and_append_metrics(directory)


