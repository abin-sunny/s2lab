import java.io.DataInputStream;
class DataInput
	{
	  public static void main(String args[])
	  	{
	  	  try
	  	      {
	  	        DataInputStream in= new DataInputStream(System.in);
	  	        System.out.println("Enter first Number: ");
	  	        int a=Integer.parseInt(in.readLine());
	  	        System.out.println("Enter second Number: ");
	  	        int b=Integer.parseInt(in.readLine());
	  	        System.out.println("sum= "+(a+b));
	  	       }
	         catch(Exception e)
	  	    	{}
	  	}
	  }
	  	 
	  	        
		
