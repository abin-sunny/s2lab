import java.util.Scanner;
class Employee
	{
	  int eno;
	  String ename;
	  double salary;
	  void getemp(int eno,String ename,double salary)
	  	{
	  	  this.eno=eno;
	  	  this.ename=ename;
	  	  this.salary=salary;
	  	  
	  	}
	  void show()
	  	{
	  	   System.out.println("employee number: "+eno+"\nemployee name: "+ename+"\n salary: "+salary);
	  	
		}
	}
class program10
	{
	  public static void main(String args[])
	  	{
	  	   Scanner s=new Scanner(System.in);
	  	   int i=0,eno,n=3;
	  	   String ename;
	  	   double salary;
	  	   //declaring array of product
	  	   
	  	   Employee[] emp;
	  	   emp=new Employee[10];
	  	   for(;i<n;i++)
	  	   	{
	  	   	  emp[i]=new Employee();
	  	   	  System.out.println("enter the eno of"+(i+1)+"th employee");
	  	   	  eno=s.nextInt();
	  	   	  s.nextLine();
	  	   	  System.out.println("enter the ename of"+(i+1)+"th employee");
	  	   	  ename=s.nextLine();
	  	   	  System.out.println("enter the salary of"+(i+1)+"th employee");
	  	   	  salary=s.nextDouble();
	  	   	  System.out.println(eno+ename+salary);
	  	   	  emp[i].getemp(eno,ename,salary);
	  	   	  
	  	   	}
	  	  /* Double min=pro[0].price;
	  	   name=pro[0].pname;
	  	   */
	  	   for(i=0;i<n;i++)
	  	   	{
	  	   	 emp[i].show();
	  	   	  /*
	  	   	  if(min>pro[i].price)
	  	   	  	{
	  	   	  	   min=pro[i].price;
	  	   	  	   name=pro[i].pname;
	  	   	  	}
	  	   	   */  	
	  	   	}
	  	   	
	  	  // System.out.println("The product having minimum price is \n name "+name+"\t having price "+min);
	  	   
	  	}
	}
	
/*output
enter the pcode of1th product
1
enter the name of1th product
Ajai
enter the price of1th product
89
1Ajai89.0
enter the pcode of2th product
2
enter the name of2th product
Ajman
enter the price of2th product
30
2Ajman30.0
enter the pcode of3th product
3
enter the name of3th product
ANU
enter the price of3th product
999
3ANU999.0
The product having minimum price is 
 name Ajman      having price 30.0
*/
