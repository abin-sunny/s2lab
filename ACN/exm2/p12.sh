echo "enter the number"
read num
temp=$num
rev=0
while((num>0))
do
((digi=num%10))
((rev=rev*10+digi))
((num=num/10))
done
if ((temp==rev))
then
echo "palindrome"
else
echo "not palindrome"
fi
