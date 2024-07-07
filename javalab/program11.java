interface Shape
	{
	  double area();
	  double perimeter();
	}
class Circle implements Shape
	{
	  double radius;
	  Circle(double radius)
	  	{
	  	  this.radius=radius;
	  	}
	 public double area()
	  	{
	  	  return 3.14*radius*radius;
	  	}
	  public double perimeter()
	  	{
	  	 return 2*3.14*radius;
	  	}
	}
class Rectangle implements Shape
	{
	  double length,breadth;
	  Rectangle (double length,double breadth)
	  	{
	  	  this.length=length;
	  	  this.breadth=breadth;
	  	}
	  public double area()
	  	{
	  	   return length*breadth;
	  	}
	  public double perimeter()
	  	{
	  	   return 2*(length+breadth);
	  	}
	  	
	}
class program11
	{
	  public static void main(String args[])
	  	{
	  	  int n=3,l=5,b=4;
	  	  Circle c1=new Circle(n);
	  	  System.out.println("The Circle with radius "+n+" have area "+c1.area()+" and perimeter "+c1.perimeter()); 
	  	  Rectangle r1=new Rectangle(l,b);
	  	  System.out.println("The Rectangle with length "+l+" and breadth "+b+" have area "+r1.area()+" and perimeter "+r1.perimeter());
	  	}
	}
/*OUTPUT
The Circle with radius 3 have area 28.259999999999998 and perimeter 18.84
The Rectangle with length 5 and breadth 4 have area 20.0 and perimeter 18.0
*/
