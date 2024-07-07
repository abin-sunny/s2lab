#!/bin/bash

# Prompt user to enter the limit
echo "Enter the number of elements:"
read limit

# Initialize array
declare -a arr

# Read array elements from the user
for ((i=0; i<limit; ++i)); do
    echo "Enter element $((i+1)):"
    read element
    arr[i]="$element"
done

# Sort array and store it in a new array
IFS=$'\n'
 sorted=($(sort <<< "${arr[*]}"))
unset IFS

# Display sorted array
echo "The sorted array is:"
for element in "${sorted[@]}"; do
    echo "$element"
done

