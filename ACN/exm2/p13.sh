echo "enter the limit"
read limit

#read array
for((i=0;i<limit;++i))
do
    echo "enter element $((i+1))"
    read arr[i]
done


#sort the array elements
for((i=0;i<limit;++i))
do
    for((j=i+1;j<limit;++j))
    do
        if((arr[i]>arr[j]))
        then
            ((temp=arr[$i]))
            ((arr[i]=arr[j]))
            arr[j]=$temp
        fi
    done
done

#print sorted array
echo "the sorted array is  ajai de  he: "
for((i=0;i<limit;++i))
do
    echo "${arr[i]}"
done

#to find the length of an array
length=${#arr[@]}
echo "length = $length"
