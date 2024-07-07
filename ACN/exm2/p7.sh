echo "1,square \n 2,circle\n3,triangle"
read i
case $i in
	1)
		echo "enter length and breadth"
		read l
		read b
		((area=l*b))
		echo "area = $area ";;
	2)
	    echo "circle"
	    ;;
	3)
	     echo "trisnglr"
esac
