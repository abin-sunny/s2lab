
DECLARE
    n NUMBER; -- Number of values to accept
     j number;
BEGIN
    -- Loop to accept 'n' values
    j:=&j;
    
    FOR i IN 1..j LOOP
        dbms_output.put_line( 'check ');
    	n:=&n;
        dbms_output.put_line(n);
         
    END LOOP;

    
END;
/

