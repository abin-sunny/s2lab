import java.util.Scanner;
class program4
	{
	  public static void main(String[] args)
	  	{
	  	  /*
	  	  this wont work in java
	  	  int m1[10][10],m2[10][10],m3[10][10];
	  	  */
	  
	  	  int[][] m1 = new int[10][10];
                  int[][] m2 = new int[10][10];
                  int[][] m3 = new int[10][10];
                  
	  	  Scanner s=new Scanner(System.in);
	  	  System.out.println("enter the order of matix with space");
	  	  int m,n;
	  	  m=s.nextInt();
	  	  n=s.nextInt();
	  	  System.out.println(m+" "+n);
	  	  
	  	  System.out.println("enter the first matrix");
	  	 for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  m1[i][j]=s.nextInt();
	  	       	}
	  	     }
	  	 System.out.println("enter the second matrix");
	  	 for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  m2[i][j]=s.nextInt();
	  	       	}
	  	     }
	  	     //to add matrix
	  	 for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  m3[i][j]=m1[i][j]+m2[i][j];
	  	       	}
	  	     }
	  	 System.out.println("resultant matrix");
	  	 for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  System.out.print(m3[i][j]+" ");
	  	       	}
	  	       	System.out.println();
	  	     }
	  	  
	  	}
	}
