class Point
     {
       int x,y;
       Point(int x,int y)
          {
            this.x=x;
            this.y=y;
          }
       void printxy()
       	    {
       	       System.out.println("x= "+x+"\ny= "+y);
       	    }
     }
class thisss
    {
      public static void main(String args[])
         {
           Point p=new Point(8,7);
           p.printxy();
         }
    }

