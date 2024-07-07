import java.util.Scanner;
class Product
	{
	  int pcode;
	  String pname;
	  double price;
	  void getproduct(int code,String name,double pric)
	  	{
	  	  pcode=code;
	  	  pname=name;
	  	  price=pric;
	  	  
	  	}
	}
class program2
	{
	  public static void main(String args[])
	  	{
	  	   Scanner s=new Scanner(System.in);
	  	   int i=0,code;
	  	   String name;
	  	   double price;
	  	   //declaring array of product
	  	   
	  	   Product[] pro;
	  	   pro=new Product[3];
	  	   Product hi=new Product();
	  	   for(;i<3;i++)
	  	   	{
	  	   	  pro[i]=new Product();
	  	   	  System.out.println("enter the pcode of"+(i+1)+"th product");
	  	   	  code=s.nextInt();
	  	   	  s.nextLine();
	  	   	  System.out.println("enter the name of"+(i+1)+"th product");
	  	   	  name=s.nextLine();
	  	   	  System.out.println("enter the price of"+(i+1)+"th product");
	  	   	  price=s.nextDouble();
	  	   	  System.out.println(code+name+price);
	  	   	  pro[i].getproduct(code,name,price);
	  	   	  
	  	   	}
	  	   Double min=pro[0].price;
	  	   name=pro[0].pname;
	  	   for(i=1;i<3;i++)
	  	   	{
	  	   	  if(min>pro[i].price)
	  	   	  	{
	  	   	  	   min=pro[i].price;
	  	   	  	   name=pro[i].pname;
	  	   	  	}
	  	   	}
	  	   	
	  	   System.out.println("The product having minimum price is \n name "+name+"\t having price "+min);
	  	   
	  	}
	}
	
/*output
enter the pcode of1th product
1
enter the name of1th product
Ajai
enter the price of1th product
89
1Ajai89.0
enter the pcode of2th product
2
enter the name of2th product
Ajman
enter the price of2th product
30
2Ajman30.0
enter the pcode of3th product
3
enter the name of3th product
ANU
enter the price of3th product
999
3ANU999.0
The product having minimum price is 
 name Ajman      having price 30.0
*/
