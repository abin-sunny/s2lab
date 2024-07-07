import java.util.Scanner;
class Img
    {
      Scanner s=new Scanner(System.in);
      double num;
      double i;
      void getimg()
      	{
      	  System.out.println("Enter the real part");
      	  num=s.nextDouble();
      	  s.nextLine();
      	  System.out.println("Enter the imaginary part");
      	  i=s.nextDouble();
      	}
      Img add(Img img)
      	{
      	  Img temp=new Img();
      	  temp.num=num+img.num;
      	  temp.i=i+img.i;
      	  return temp;
      	  //System.out.println("After addiction");
      	 // System.out.println((num+img.num)+"+"+(i+img.i)+"i");
      	}
      void disp()
      	{
      	 System.out.println(num+"+"+i+"i");
      	}
    }
class Program3a
    {
     public static void main(String args[])
         {
	  Img sum;
	  Img i1=new Img();
	  i1.getimg();
	  System.out.println("first img");
	  i1.disp();
	  Img i2=new Img();
	  i2.getimg();
	  System.out.println("first img");
	  i2.disp();
	  sum=i1.add(i2);
	  sum.disp();
	 }
	  
	}
	
