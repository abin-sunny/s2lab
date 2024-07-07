class Points
     {
       int x,y;
       Points(int a,int b)
          {
            x=a;
            y=b;
          }
       void printxy()
       	    {
       	       System.out.println("x= "+x+"\ny= "+y);
       	    }
     }
class nothisss
    {
      public static void main(String args[])
         {
           Points p=new Points(8,7);
           p.printxy();
         }
    }
