import java.util.Scanner;
class Scannerdemo
	{
	  public static void main(String args[])
	  	{
	  	  try
	  	      {
	  	        Scanner s=new Scanner(System.in);
	  	        
	  	        System.out.println("Enter first Number: ");
	  	        int a=s.nextInt();
	  	        System.out.println("Enter second Number: ");
	  	        int b=s.nextInt();
	  	        System.out.println("sum= "+(a+b));
	  	       }
	         catch(Exception e)
	  	    	{}
	  	}
	  }
	  	 
	  	        
		
