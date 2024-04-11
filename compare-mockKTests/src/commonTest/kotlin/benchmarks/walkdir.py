import os
import numpy as np

def calculate_and_append_metrics(directory):
    for subdir, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(subdir, file)
            with open(file_path, 'r+') as f:
                times = []
                for line in f:
                    if line.startswith('real'):
                        # Replace tabs with spaces, then split
                        parts = line.replace('\t', ' ').split()
                        # Assuming the time part is always the second element after 'real'
                        time_str = parts[1] if len(parts) > 1 else ''
                        # Split time_str into minutes and seconds
                        minutes, seconds = time_str.split('m')
                        total_seconds = float(minutes) * 60 + float(seconds.rstrip('s'))
                        times.append(total_seconds)

                average = np.mean(times)
                variance = np.var(times)

                f.seek(0, os.SEEK_END)  # Move to the end of the file before writing
                f.write(f'\n\nAverage: {average:.3f}s\nVariance: {variance:.3f}s\n')

directories = ['1024']
for directory in directories:
    calculate_and_append_metrics(directory)
