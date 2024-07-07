import java.util.Scanner;
//constructor should be called first in a function if we intent to call it
class Person
	{
	  // Package-private (default) access ,note:default is not public ,
	  static Scanner s=new Scanner(System.in);
	  String name,address,gender;
	  int age;
	  //constructor
	  Person(String name,String address,String gender,int age)
	  	{
	  	 this.name=name;
	  	 this.address=address;
	  	 this.gender=gender;
	  	 this.age=age;
	  	}
	  void display()
	  	{
	  	  System.out.println("............................................................................................");
	  	  System.out.println("Name: "+name+"\nAddress: "+address+"\ngender: "+gender+"\nage: "+age);
	  	}
	}
class Employee extends Person
	{
	  int emp_id;
	  String company_name,qualification;
	  double salary;
	  //constructor
	  Employee(String name,String address,String gender,int age,int emp_id,String company_name,String qualification,double salary)
	  	{
	  	  //invoking constructor of super/parent class here it is class named Person
	  	  super(name,address,gender,age);
	  	  this.emp_id=emp_id;
	  	  this.company_name=company_name;
	  	  this.qualification=qualification;
	  	  this.salary=salary;
	  	}
	  void display()
	  	{
	  	  super.display();
	  	  System.out.println("Employee id: "+emp_id+"\nCompany name: "+company_name+"\nQualification: "+qualification+"\nSalary: "+salary);
	  	  
	  	}
	  
	}
class Teacher extends Employee
	{
	  int teacher_id;
	  String department,subject;
	  //constructor
	  Teacher(String name,String address,String gender,int age,int emp_id,String company_name,String qualification,double salary,int teacher_id,String department,String subject)
	  	{
	  	  super(name,address,gender,age,emp_id,company_name,qualification,salary);
	  	  this.teacher_id=teacher_id;
	  	  this.department=department;
	  	  this.subject=subject;
	  	}
	  void display()
	  	{
	  	 super.display();
	  	 System.out.println("Teacher id: "+teacher_id+"\nDepartment: "+department+"\nSubject: "+subject);
	  	}
	  void setTeacher()
	  	{
	  	  String name,address,gender,company_name,qualification,department,subject;
	  	  int age,emp_id,teacher_id;
	  	  double salary;

	  	  //this(name,address,gender,age,emp_id,company_name,qualification,salary,teacher_id,department,subject);
	  	}
	}
// program 10.2

class Program10
	{
	  public static void main(String args[])
	  	{
	  	/* try 1 of firt class
	  	  Person ajai=new Person("Ajaidev.s","Perumbavoor","Male",21);
	  	  ajai.put_person();
	  	 */
	  	 
	  	 /* try 2 of 2 class inheritance 
	  	 
	  	 Employee ajai=new Employee("Ajaidev.s","Perumbavoor","Male",21,1,"Logiprompt","Mca",25000);
	  	 ajai.display();
	  	 */
	  	 Teacher ajai=new Teacher("Ajaidev.s","Perumbavoor","Male",21,1,"Logiprompt","Mca",25000,1,"MCA","Bussiness Management");
	  	 ajai.display();
	  	 String name,address,gender,company_name,qualification,department,subject;
	  	 Scanner s=new Scanner(System.in);
	  	  int age,emp_id,teacher_id,n;
	  	  double salary;
	  	  System.out.println("Enter the number of Teachers: ");
	  	  n=s.nextInt();
	  	  s.nextLine();
	  	  Teacher t1[]=new Teacher[n];
	  	  for(int i=0;i<n;i++)
	  	  	{
	  	  	  System.out.println("Enter the Details of "+(i+1)+"th Teacher\n......................................................................"); 
	  	  	  System.out.println("Enter the Name: ");
	  		  name=s.nextLine();
	  	  	  System.out.println("Enter the Address: ");
	  	  	  address=s.nextLine();
	  	  	  System.out.println("Enter the gender");
	  	  	  gender=s.nextLine();
	  	  	  System.out.println("Enter the age: ");
	  	  	  age=s.nextInt();
	  	  	  System.out.println("Enter the Employee id: ");
	  	  	  emp_id=s.nextInt();
	  	  	  s.nextLine();
	  	  	  System.out.println("Enter the Company name: ");
	  	  	  company_name=s.nextLine();
	  	  	  System.out.println("Enter the Qualification: ");
	  	  	  qualification=s.nextLine();
	  	  	  System.out.println("Enter the Salary: ");
	  	  	  salary=s.nextDouble();
	  	  	  System.out.println("Enter the Teacher_id");
	  	  	  teacher_id=s.nextInt();
	  	  	  s.nextLine();
	  	  	  System.out.println("Enter the department: ");
	  	  	  department=s.nextLine();
	  	  	  System.out.println("Enter the Subject: ");
	  	  	  subject=s.nextLine();
	  	  	  t1[i]=new Teacher(name,address,gender,age,emp_id,company_name,qualification,salary,teacher_id,department,subject);
	  	  	  t1[i].display();
	  	  	}
	  	  System.out.println("Teachers details\n...................................");
	  	    for(int i=0;i<n;i++)
	  	  	{
	  	  	  t1[i].display();
	  	  	}
	  	  
	  	}
	}
/*OUTPUT
............................................................................................
Name: Ajaidev.s
Address: Perumbavoor
gender: Male
age: 21
Employee id: 1
Company name: Logiprompt
Qualification: Mca
Salary: 25000.0
Teacher id: 1
Department: MCA
Subject: Bussiness Management
Enter the number of Teachers: 
2
Enter the Details of 1th Teacher
......................................................................
Enter the Name: 
ajai
Enter the Address: 
perumbavoor
Enter the gender
male
Enter the age: 
21
Enter the Employee id: 
2
Enter the Company name: 
Logiprompt
Enter the Qualification: 
mca
Enter the Salary: 
25000
Enter the Teacher_id
5
Enter the department: 
BCA
Enter the Subject: 
Java
............................................................................................
Name: ajai
Address: perumbavoor
gender: male
age: 21
Employee id: 2
Company name: Logiprompt
Qualification: mca
Salary: 25000.0
Teacher id: 5
Department: BCA
Subject: Java
Enter the Details of 2th Teacher
......................................................................
Enter the Name: 
Ajith
Enter the Address: 
Pala
Enter the gender
male
Enter the age: 
25
Enter the Employee id: 
2
Enter the Company name: 
Infosys
Enter the Qualification: 
MCA
Enter the Salary: 
35000
Enter the Teacher_id
8
Enter the department: 
MCA
Enter the Subject: 
Stati
............................................................................................
Name: Ajith
Address: Pala
gender: male
age: 25
Employee id: 2
Company name: Infosys
Qualification: MCA
Salary: 35000.0
Teacher id: 8
Department: MCA
Subject: Stati
Teachers details
...................................
............................................................................................
Name: ajai
Address: perumbavoor
gender: male
age: 21
Employee id: 2
Company name: Logiprompt
Qualification: mca
Salary: 25000.0
Teacher id: 5
Department: BCA
Subject: Java
............................................................................................
Name: Ajith
Address: Pala
gender: male
age: 25
Employee id: 2
Company name: Infosys
Qualification: MCA
Salary: 35000.0
Teacher id: 8
Department: MCA
Subject: Stati
*/
