a=0
until [ $a -eq 10 ]
	do
		echo $a
		a=$(expr $a + 1)
	done
