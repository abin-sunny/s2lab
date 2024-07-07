declare
	fact number:=1;
	n number(5);
begin
	n:=&n;
	for i in 1..n
	   loop
	   	fact:=fact*i;
	   end loop;
	dbms_output.put_line('Factorial of number ' || n || ' is ' || fact);
end;
/
	   
