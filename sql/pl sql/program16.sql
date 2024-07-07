Set Serveroutput ON
Create or replace function addnum (val1 in number,val2 in number)
return number is
Total number;
hi number;
Begin
Total := val1+val2;
hi:=total;
Return(hi);
End addnum;
/
Select addnum(3,4) from dual;
