class Rectangle
     {
        int length,breadth;
        void getData(int x,int y)
        	{
        	  length=x;
        	  breadth=y;
        	}
        int area()
            {
               int area;
               area=length*breadth;
               return(area);
            }
     }
         
class RectArea
    {
      public static void main(String args[])
         {
           Rectangle rect1= new Rectangle();
           rect1.getData(4,5);
           int a=rect1.area();
           System.out.println("Length of Rectangel="+rect1.length);
           System.out.println("Breadtth of Rectangel="+rect1.breadth);
           System.out.println("Area of Rectangle="+a);
         }
    }
