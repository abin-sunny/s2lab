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
	  	   int i=0,eno,n=3,search,flag=0;
	  	   String ename;
	  	   double salary;
	  	   //declaring array of product
	  	   Employee[] emp;
	  	   emp=new Employee[10];
	  	   System.out.println("enter the number of employees");
	  	   n=s.nextInt();
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
	  	   System.out.println("enter eno of employee to be searched");
	  	   search=s.nextInt();
	  	   
	  	   
	  	   for(i=0;i<n;i++)
	  	   	{
	  	   	if(emp[i].eno==search)
	  	   		{
	  	   	 	   emp[i].show();
	  	   	 	   flag=1;
	  	   	        } 	
	  	   	}
	  	   if(flag==0)
	  	   	{
	  	   	  System.out.println("invalid employee number");
	  	   	}

	  	   
	  	}
	}
	
/*output
enter the number of employees
3
enter the eno of1th employee
11
enter the ename of1th employee
ajai dev
enter the salary of1th employee
10000
11ajai dev10000.0
enter the eno of2th employee
12
enter the ename of2th employee
ajay
enter the salary of2th employee
35000
12ajay35000.0
enter the eno of3th employee
13
enter the ename of3th employee
ajith
enter the salary of3th employee
45000
13ajith45000.0
enter eno of employee to be searched
12
employee number: 12
employee name: ajay
 salary: 35000.0

*/
