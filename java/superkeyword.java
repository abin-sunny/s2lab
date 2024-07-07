class Point
    {
      int x,y;
      Point(int x,int y)
         {
           this.x=x;
           this.y=y;
         }
    }
class Point3D extends Point
     {
       int z;
       Point3D(int x,int y,int z)
          {
            super(x,y);
            this.z=z;
          }
     }
class Point3DDemo
     {  public static void main(String args[])
              {
                Point3D p=new Point3D(100,200,300);
                System.out.println("x= "+p.x+"\ny= "+p.y+"z= "+p.z);
              }
       
     }  
