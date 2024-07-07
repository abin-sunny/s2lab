abstract class Person
	{
	  abstract void printP();
	  void printHello()
	  	{
	  	  System.out.println("Hello world");
	  	}
	  //abstract void hello();
	  //this will return error since it isnt overiden in Student class.its not an error of Person class but of Student class
	}
//object of abstract class cant be created but its reference variable can be created
class Student extends Person
	{
	  void printP()
	  	{
	  	  System.out.println("Hello its extended abstract function overiding");
	  	}
	  
	}
class abstract1
	{
	  public static void main(String args[])
	  	{
	  	  Student s= new Student();
	  	  s.printP();
	  	  s.printHello();
	  	  //p is reference variable of Person class
	  	  //creation of object of Person class isnt possible since its an abstract class
	  	  Person p=new Student();
	  	  //object of Student class is stored in reference variable of Person
	  	  p.printP();
	  	  p.printHello();
	  	}
	}
