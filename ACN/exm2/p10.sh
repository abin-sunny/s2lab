echo "enter number"
read num
temp=$num
if [ $num -lt 10 ]
then
   sum=$num
else
     sum=0
     while [ $num -ne 0 ]
     do
       dig=$(($num%10))
       sum=$(($sum+$dig))
       num=$(($num/10))
     done
     num=$sum
fi
echo "sum of the digit $temp is $sum"
