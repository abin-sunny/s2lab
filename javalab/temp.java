class Person
	{
	  String name;
	  int age;
	  //creating constructor
	  Person(String name,int age)
	  	{
	  	  this.name=name;
	  	  this.age=age;
	  	}
	  void printPerson()
	  	{
	  	  System.out.println("Name: "+name);
	  	  System.out.println("age: "+age);
	  	}
	  
	}
class Student extends Person
	{
	   String batch;
	   //constructor
	   Student(String name,int age,String batch)
	   	{
	   	  //calling parent constructor
	   	  super(name,age);
	   	  //note that if u are calling parent constructor in child class .calling parent constructor should be the first line
	   	  
	   	  this.batch=batch;
	   	}
	   void printStudent()
	   	{
	   	 
	   	  System.out.println("Batch: "+batch);
	   	   super.printPerson();
	   	  //calling printPerson() function of parent class
	   	  //note that you can call super class function anywhere in this function
	   	}
	}
class program25
	{
	  public static void main(String args[])
	  	{
	  	  Student ajai=new Student("AJAIDEV",21,"MCA");
	          ajai.printStudent();
	  	}
	  
	}
/*
Batch: MCA
Name: AJAIDEV
age: 21
           
           */
