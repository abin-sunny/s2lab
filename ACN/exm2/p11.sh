ajai="ajaidev"
#ajai enna variabilil ajaidev enna string kettivach
rev=""
len=${#ajai}
#len il aaa string "ajaidev" il etra characters inden calculate cheythit store akki
echo $len
for((i=len;i>=0;i--))
	do
	
	   rev="$rev${name:$i:1}"
	   #its equal to rev=rev+substring(name_of_string: starting_index : no of characters
	   echo $rev
	done
