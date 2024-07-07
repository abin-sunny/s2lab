class Student
	{
	  int roll_no;
	  String name;
	   static void printclg()
	  	{
	  	System.out.println("MAR ATHENACIOUS COLLEGE OF ENGINEERING");
	  	}
	  void getstudent(int roll,String nam)
	  	{
	  	  roll_no=roll;
	  	  name=nam;
	  	}
	  void printstudent()
	  	{
	  	  System.out.println("Roll no"+roll_no+"\nname:"+name);
	  	}
	}
class program1
	{
	  public static void main(String args[])
	  	{
	  	  Student s1= new Student();
	  	  //to use static function u have to use the class name .that is            classname.functionname
	  	  Student.printclg();
	  	  s1.getstudent(1,"Ajaidev");
	  	  s1.printstudent();
	  	}
	}
/*
OUTPUT

MAR ATHENACIOUS COLLEGE OF ENGINEERING
Roll no1
name:Ajaidev
*/

