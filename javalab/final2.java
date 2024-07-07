class Hello
	{
	  final int a ;
	  // if u use final int a=10 then u cant change its value never even if u use constructor 
	  Hello(int a)
	  	{
	  	  this.a=a;
	  	}
	  
	}
class final2
	{
	  public static void main(String args[])
	  	{
	  	  Hello hi= new Hello(56);
	  	  System.out.println(hi.a);
	  	}
	}
