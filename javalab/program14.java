import java.util.Scanner;
class Neg extends Exception
	{
	  public Neg(String msg)
	   	{
	   	  super(msg);
	   	}
	}
class program14
	{
	  public static void main(String args[])
	  	{  try
	  		{
	  		  Scanner s=new Scanner(System.in);
	  	          int n,sum=0,avg,number;
	  	          System.out.println("Enter a number: ");
	  	          n=s.nextInt();
	  	          for(int i=0;i<n;i++)
	  	          	{
	  	          	  System.out.println("enter a number: ");
	  	          	  number=s.nextInt();
	  	          	  if(number<0)
	  	          	  	{
	  	          	  	   throw new Neg("Negative number encountered");
	  	          	  	}
	  	          	  sum+=number;
	  	          	}
	  	          avg=sum/n;
	  	          System.out.println("The average is : "+avg);
	  		}
	  	   catch(Exception e)
	  	   	{
	  	   	  System.out.println(e.getMessage());
	  	   	}
	  	   
	  	   
	  	}
	}
