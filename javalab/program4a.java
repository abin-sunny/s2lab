import java.util.Scanner;
class Matrix
	{
	  int m,n;
	  Scanner s=new Scanner(System.in);
	  int[][] matrix = new int[10][10];
	  //function to accept matrix
	  void get_matrix()
	  	{
	  	   System.out.println("enter the order of matix with space");
	  	   m=s.nextInt();
	  	   n=s.nextInt();
	  	   System.out.println("enter the matrix");
	  	 for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  matrix[i][j]=s.nextInt();
	  	       	}
	  	     }
	  	}
	  //function to display matrix
	  void display()
	  	{
	  	  for(int i=0;i<m;i++)
	  	     {
	  	       for(int j=0;j<n;j++)
	  	       	{
	  	       	  System.out.print(matrix[i][j]+" ");
	  	       	}
	  	       	System.out.println();
	  	     }
	  	}
	  Matrix add(Matrix m2)
	  	{
	  	   Matrix temp=new Matrix();
	  	   if(m==m2.m && n==m2.n)
	  	   	{
	  	   	  temp.m=m;
	  	   	  temp.n=n;
	  	   	  for(int i=0;i<m;i++)
	  	              {
	  	     		  for(int j=0;j<n;j++)
	  	       			{
	  	       			  temp.matrix[i][j]=matrix[i][j]+m2.matrix[i][j];
	  	       			}
	  	    	      }
	  	   	  
	  	   	}
	  	   else
	  	   	{
	  	   	  System.out.println("Matrix addiction isnt possible");
	  	   	}
	  	   return temp;
	  	}
	}
	//driver code
class program4a
	{
	  public static void main(String[] args)
	  	{
	  	  Matrix M1=new Matrix();
	  	  Matrix M2=new Matrix();
	  	  Matrix M3;
	  	  System.out.println("first matrix");
	  	  M1.get_matrix();
	  	  System.out.println("second matrix");
	  	  M2.get_matrix();
	  	  System.out.println("Sum of those matrix is");
	  	  M3=M1.add(M2);
	  	  M3.display();
	  	  
	  	}
	}
/*Output
first matrix
enter the order of matix with space
3 3
enter the matrix
1 2 3
4 5 6
7 8 9
second matrix
enter the order of matix with space
3 3
enter the matrix
1 2 3
4 5 6
7 8 9
Sum of those matrix is
2 4 6 
8 10 12 
14 16 18 
*/

