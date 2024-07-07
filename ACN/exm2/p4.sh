a=10
until [ $a -eq 0 ]
	do
		echo $a
		a=$(expr $a - 1 )
	done
