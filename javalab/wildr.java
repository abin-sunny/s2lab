//private protected and public are related  to packages also not only classes

class Hello
	{
	 protected int a;
	 }
class Hai extends Hello
	{
	 void set(int a)
	 	{
	 	  this.a=a;
	 	}
	  void print()
	  	{
	  	 System.out.println(a);
	  	}
	}
class Hlo extends Hai
	{
	 void sett(int a)
	 	{
	 	  this.a=a;
	 	}
	  void printt()
	  	{
	  	 System.out.println(a);
	  	}
	}
class wildr
	{
	  public static void main(String args[])
	  	{
	  	   Hai ajai= new Hai();
	  	   ajai.set(5);
	  	   ajai.print();
	  	   System.out.println(ajai.a);
	  	   System.out.println("...................................................................");
	  	   Hlo hi=new Hlo();
	  	   hi.sett(6);
	  	   hi.printt();
	  	   System.out.println(hi.a);
	  	}
	}
