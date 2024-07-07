import java.util.Scanner;
class Student
	{ string name;
	  int age,m1,m2,m3;
	  Student(string name,int age,int m1,int m2,int m2)
	  	{
	  	  this.name=name;
	  	  this.age=age;
	  	  this.m1=m1;
	  	  this.m2=m2;
	  	  this.m3=m3;
	  	  
	  	}
	  void printst()
	  	{
	  	  System.out.println("Name:"+name+"\nAge:"+age+"\nMark1"+m1+"\nMark2"+m2+"\nMark3"+m3);
	  	}
	  }
class Studentpgrm
	{
	  Scanner s=new Scanner(System.in);
	  Student ajai=new Student("Ajaidev",21,80,84,45);
	  ajai.printst();
	}


