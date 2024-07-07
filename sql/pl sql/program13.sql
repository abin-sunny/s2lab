declare
	name varchar2(20);
	rev varchar2(20);
	len number(2);
begin
	name:='&name';
	len=length(name);
	for i in reverse 1..len
    	    loop
    	    	  rev=rev||substr(name,i,1);
    	    end loop;
    	dbms_output
	

