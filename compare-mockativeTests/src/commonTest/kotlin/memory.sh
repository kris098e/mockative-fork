#!/bin/bash

CONTAINER_NAME="blissful_hoover"
STATS_FILE="statss" # Replace with the path where you want to save stats inside the container

# Clear the stats file
echo "" > "$STATS_FILE"

# Monitor the container's memory usage and append it to the stats file
while true; do
  sleep 1
  # Check if the container is still running
  if ! docker inspect -f '{{.State.Running}}' "$CONTAINER_NAME" | grep true > /dev/null; then
    echo "Container $CONTAINER_NAME has stopped."
    break
  fi
  # Record the memory and CPU usage
  docker stats "$CONTAINER_NAME" --no-stream --format "{{.MemUsage}} {{.CPUPerc}}" | while read -r stats; do
    echo "$stats"
  done >> "$STATS_FILE"
done

# Print the collected stats
echo "Memory and CPU usage for container $CONTAINER_NAME:"
cat "$STATS_FILE"
