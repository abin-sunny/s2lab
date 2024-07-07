class Hello
	{
	  void display()
	  	{
	  	   System.out.println(this);
	  	}
	}
class thisss
	{
	  public static void main(String args[])
	  {
	  Hello name[]=new Hello[5];
	  for(int i=0;i<5;i++)
	  	{
	  	  name[i]=new Hello();
	  	  name[i].display();
	  	  System.out.println(name[i]);
	  	  System.out.println(name);
	  	  
	  	}
	  }	
	}
