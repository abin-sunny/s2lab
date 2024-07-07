import java.util.Scanner;
class Img
    {
      Scanner s=new Scanner(System.in);
      int num;
      int i;
      void getimg()
      	{
      	  System.out.println("Enter the real part");
      	  num=s.nextInt();
      	  s.nextLine();
      	  System.out.println("Enter the imaginary part");
      	  i=s.nextInt();
      	}
      void add(Img img)
      	{
      	  System.out.println("After addiction");
      	  System.out.println((num+img.num)+"+"+(i+img.i)+"i");
      	}
      void disp()
      	{
      	 System.out.println(num+"+"+i+"i");
      	}
    }
class Program3
    {
     public static void main(String args[])
         {
	  
	  Img i1=new Img();
	  i1.getimg();
	  System.out.println("first img");
	  i1.disp();
	  Img i2=new Img();
	  i2.getimg();
	  System.out.println("first img");
	  i2.disp();
	  i1.add(i2);
	 }
	  
	}
	
