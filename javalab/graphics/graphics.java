package graphics;
class Rectangle
	{ double length,breadth;
	  Rectangle(double length,double breadth)
	  	{
	  	  this.length=length;
	  	  this.breadth=breadth;
	  	}
	  double area()
	  	{
	  	  return length*breadth;
	  	}
	  	
	}
class Triangle
	{
	   double length,height;
	   Triangle(double length,double height)
	   	{
	   	  this.length=length;
	   	  this.height=height;
	   	}
	   
	}
class Square
	{
	  double length,breadth;
	  Square(double length,double breadth)
	  	{
	  	  this.length=length;
	  	  this.breadth=breadth;
	  	}
	  double area()
	  	{
	  	  return length*breadth;
	  	}
	}
 class Circle
	{
	  double radius;
	  Circle(double radius)
	  	{
	  	  this.radius=radius;
	  	}
	  double area()
	  	{
	  	  return 3.14*radius*radius;
	  	}
	}
