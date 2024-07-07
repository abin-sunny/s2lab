class InvalidLogin extends Exception
	{
	  public InvalidLogin(String msg)
	   	{
	   	  super(msg);
	   	}
	}
class Login
	{
	  void authenticate(String username,String password)throws InvalidLogin
	  	{
	  	   if(username==null || username.isEmpty() || password==null || password.isEmpty())
	  	   	{
	  	   	    throw new InvalidLogin("Invalid username or password");
	  	   	}
	  	   System.out.println("sucessfull Login. Welcome "+username);
	  	}
	  
	}
class program13
	{
	  public static void main(String args[])
	  	{
	  	    try
	  	    	{
	  	    	  Login ajai=new Login();
	  	    	  Login ajith=new Login();
	  	    	  ajai.authenticate("Ajaidev s","12345678");
	  	    	  ajith.authenticate("Ajith","");
	  	    	  
	  	    	}
	  	    catch(Exception ex)
	  	    	{
	  	    	  System.out.println(ex.getMessage());
	  	    	}
	  	}
	}
