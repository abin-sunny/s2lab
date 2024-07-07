import graphics.*;
public class program12
	{
	  public static void main(String args[])
	  	{  int r=3,l=5,b=3,h=4;
	  	   Circle c1=new Circle(r);
	  	   System.out.println("area of Circle with radius "+r+" is : "+c1.area());
	  	   Rectangle r1=new Rectangle(l,b);
	  	   System.out.println("Area of Rectangle with length "+l+" and breadth "+b+" is : "+r1.area());
	  	   Square s1=new Square(l);
	  	   System.out.println("Area of Square with length "+l+" is : "+s1.area());
	  	   Triangle t1=new Triangle(l,h);
	  	   System.out.println("Area of Triangle with length "+l+" and height "+h+" is : "+t1.area());
	  	}
	}
/* Output
  area of Circle with radius 3 is : 28.259999999999998
Area of Rectangle with length 5 and breadth 3 is : 15.0
Area of Square with length 5 is : 25.0
Area of Triangle with length 5 and height 4 is : 10.0

*/
