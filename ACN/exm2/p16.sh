echo "enter the limit"
read n
flag=0
for((i=2;i<n;i++))
do
   if [ $(($n%i)) -eq 0 ]
   then
       flag=1
       break
   fi
done
if [ $flag -eq 0 ] && [ $n -ne 1 ]
then
    echo "prime"
else
    echo "not prime"
fi
