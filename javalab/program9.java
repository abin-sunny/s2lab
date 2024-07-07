//function overloading without class
import java.util.Scanner;
class program9
	{
	   static double area(float r)
	   	{
	   	  return 3.14*r*r;
	   	}
	   static double area(float length,float breadth)
	   	{
	   	  return length*breadth;
	   	}
	   static double area(float base,float heigth,double half)
	   	{
	   	   return half*base*heigth;
	   	}
	   public static void main(String args[])
	   	{
	   	  int c;
	   	  float l,b,h,r;
	   	  Scanner s=new Scanner(System.in);
	   	  System.out.println("Enter your choice \n1,Circle\n2,Rectangle/Square\n3,Triangle");
	   	  c=s.nextInt();
	   	  switch(c)
	   	  	{
	   	  	  case 1: System.out.println("Enter the radius: ");
	   	  	          r=s.nextFloat();
	   	  	          System.out.println("Area: "+area(r));
	   	  	          break;
	   	  	  case 2: System.out.println("Enter the length and breadth : ");
	   	  	  	   l=s.nextFloat();
	   	  	  	   b=s.nextFloat();
	   	  	  	   System.out.println("Area: "+area(l,b));
	   	  	  	   break;
	   	  	  case 3: System.out.println("Enter the base and heigth : ");
	   	  	  	   b=s.nextFloat();
	   	  	  	   h=s.nextFloat();
	   	  	  	   System.out.println("Area: "+area(b,h,.5));
	   	  	  	   break;
	   	  	  default: System.out.println("Invalid choice");
	   	  	}
	   	}
	}
 
