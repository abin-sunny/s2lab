DECLARE 
   a number; 
   b number; 
   c number;
BEGIN 
   a:= &a; 
   b:= &b; 
findMin(a, b, c); 
   dbms_output.put_line(' Minimum value is: ' || c); 
END; 
/
