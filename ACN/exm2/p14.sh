#program to sort string elements in an array
echo "enter the limit"
read limit
arr=()

#read array
for((i=0;i<limit;++i))
do
    echo "enter element $((i+1))"
    read element
    arr[i]+="$element"
done

#sort array
sorted=($(printf "%s\n" "${arr[@]}" |sort))

#display sorted array
echo "the sorted array is : "
for((i=0;i<limit;++i))
do
    echo "${sorted[i]}"
done
