a=10
until [ $a -lt 0 ]
	do
		echo $a
		a=$(expr $a + 1)
#below code to break the infinity loop
		if [ $a -eq 100 ]
			then
				break
#use of continue statement is similar as cpp
		fi
	done
