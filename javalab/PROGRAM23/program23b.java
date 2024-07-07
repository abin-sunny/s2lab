import java.io.*;
import java.util.Scanner;
class program23b
	{
	  public static void main(String args[])
	  	{
	  	  try
	  	  	{
	  	  	   int temp;
	  	  	   File myfile=new File("evenodd.txt");
	  	  	   File odd=new File("odd.txt");
	  	  	   odd.createNewFile();
	  	  	   FileWriter owriter=new FileWriter(odd,true);
	  	  	   File even=new File("even.txt");
	  	  	   even.createNewFile();
	  	  	   FileWriter ewriter=new FileWriter(even,true);
	  	  	   String line;
	  	  	  
	  	  	   
	  	  	   Scanner s=new Scanner(myfile);
	  	  	   while(s.hasNextLine())
	  	  	   	{
	  	  	   	  line=s.nextLine();
	  	  	   	  if(line!="")
	  	  	   	  	{
		  	  	   	  temp=Integer.parseInt(line);
		  	  	   	  System.out.println(temp);
		  	  	   	  if(temp%2==0)
		  	  	   	  	{
		  	  	   	  	  ewriter.write(temp+"\n");
		  	  	   	  	}
		  	  	   	  else
		  	  	   	  	{
		  	  	   	  	 owriter.write(temp+"\n");
		  	  	   	  	}
		  	  	   	  	 
	  	  	   	  	}
	  	  	   	}
	  	  	   	owriter.close();
	  	  	   	ewriter.close();
	  	  	}
	  	  catch(Exception e)
	  	  	{
	  	  	 System.out.println(e);
	  	  	}
	  	}
	}
