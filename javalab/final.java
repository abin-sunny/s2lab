final class Person
	{
	  void hello()
	  	{
	  	  System.out.println("wildr");
	  	}
	}
// u cant inherit this class to any otheer class since it is a final class

class Parent
	{
	  final void print()
	  	{
	  	  System.out.println("Parent class");
	  	}
	}
class Child extends Parent
	{
	// this will return error since we try to overide a function that is declared as final
	  void print()
	  	{
	  	  System.out.println("Child");
	  	}
	}
class final1
	{
	  public static void main(String args[])
	  	{
	  	  Person p=new Person();
	  	  p.hello();
	  	  Child c=new Child();
	  	  c.print();
	  	}
	}
