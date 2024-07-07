import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class program16
	{
	  static Scanner s= new Scanner(System.in);
	  static int top=-1,max=5;
	  static int[] stack=new int[5];
	  static void stack()
	  	{
	  	  
	  	}
	  static void push()
	  	{
	  	  if(top==max-1)
	  	  	{
	  	  	  System.out.println("Stack Overflow");
	  	  	}
	  	  else
	  	  	{
	  	  	  System.out.println("Enter the value to be inserted");
	  	  	  top+=1;
	  	  	  stack[top]=s.nextInt();
	  	  	  
	  	  	}
	  	}
	  static int pop()
	  	{
	  	  if(top==-1)
	  	  	{
	  	  	  System.out.println("Stack underflow");
	  	  	  return -999;
			}
		  else
		  	{
		  	  top-=1;
		  	  return stack[top+1];
		  	}
	  	}
	  public static void main (String args[])
	  	{
	  	  int c=3,choice=5,temp;
	  	  if(c==1)
	  	  	{
	  	  	  
	  	  	  while(choice!=3)
	  	  	  	{
	  	  	  	  System.out.println("Enter your choice\n1.push\n2.pop\n3.exit");
	  	  	  	  choice=s.nextInt();
	  	  	  	  switch(choice)
	  	  	  	  	{
	  	  	  	  	  case 1: push();
	  	  	  	  	          break;
  	  	  	    		  case 2: temp=pop();
  	  	  	    		          if(temp!=-999)
  	  	  	    		  	  System.out.println("poped element: "+temp);
  	  	  	    		  	  break;
  	  	    		  	  case 3: System.out.println("exiting");
  	  	    		  	          break;
  	    		  	          default: System.out.println("Invalid choice");
  	  	    		  	         
  	  	  	    		  
	  	  	  	  	}
	  	  	  	}
	  	  
	  	  	  
	  	  	}
	  	  else if(c==2)
	  	  	{
	  	  	   List<String> stringList = new ArrayList<>();
	  	  	   String ins,dlt;
	  	  	   int pos;
	  	  	   choice=10;
	  	  	   while(choice!=9)
	  	  	   	{
	  	  	   	  System.out.println("Enter your choice\n1.insertion\n2.insert at index\n3.remove(index)\n4.remove(element)\n5.get element\n6.check if empty\n7.size\n8.print\n9.exit");
	  	  	   	  choice=s.nextInt();
	  	  	   	  switch(choice)
	  	  	   	  	{
	  	  	   	  	  case 1: System.out.println("Enter the element to be inserted");
	  	  	   	  	          s.nextLine();
	  	  	   	  	          ins=s.nextLine();
	  	  	   	  	          stringList.add(ins);
	  	  	   	  	          break;
	  	  	   	  	  case 2: System.out.println("Enter the position to insert value");
	  	  	   	  	          pos=s.nextInt();
	  	  	   	  	          if(pos<=stringList.size()+1)
	  	  	   	  	          	{
	  	  	   	  	          	  System.out.println("Enter the element to be inserted");
	  	  	   	  	          	  s.nextLine();
	  	  	   	  	        	  ins=s.nextLine();
	  	  	   	  	          	  stringList.add(pos-1,ins); 
	  	  	   	  	          	}
	  	  	   	  	          else
	  	  	   	  	          	System.out.println("invalid position");
	  	  	   	  	          break;
	  	  	   	  	  case 3: System.out.println("enter the position of element to be dlted");
	  	  	   	  	  	  pos=s.nextInt();
	  	  	   	  	  	  stringList.remove(pos-1);
	  	  	   	  	  	  break;
	  	  	   	  	  case 4: System.out.println("Enter the element to be dlted");
	  	  	   	  	          s.nextLine();
	  	  	   	  	          dlt=s.nextLine();
	  	  	   	  	          stringList.remove(dlt);
	  	  	   	  	          break;
	  	  	   	  	  case 5: System.out.println("enter the position");
	  	  	   	  	          pos=s.nextInt();
	  	  	   	  	          if(pos<=stringList.size())
	  	  	   	  	          	System.out.println(stringList.get(pos-1));
	  	  	   	  	          else
	  	  	   	  	          	System.out.println("invalid position");
	  	  	   	  	          break;
	  	  	   	  	  case 6: System.out.println("is the list empty? "+stringList.isEmpty());
	  	  	   	  	  	  break;
	  	  	   	  	  case 7: System.out.println("size of list is: "+stringList.size());
	  	  	   	  	          break;
	  	  	   	  	         
 					  case 8: for(String item : stringList)
 					  		{
 				 	  		  System.out.println(item);
 					  		} 	  	       
 					  	  break;
 					  case 9: System.out.println("Exiting......");
 					          break;
 					  default: System.out.println("invalid option");
	  	  	   	  	}
	  	  	   	}
	  	  	   
	  	  	}
	  	  else if(c==3)
	  	  	{
	  	  	  Stack<Integer> stack=new Stack<>();
	  	  	  do
	  	  	  	{
	  	  	  	   System.out.println("Enter your choice \n1.push\n2.pop\n3.search\n4.check if empty\n5.view top element\n6.print\n7.exit");
	  	  	  	   choice=s.nextInt();
	  	  	  	   switch(choice)
	  	  	  	   	{
	  	  	  	   	  case 1: System.out.println("enter the element to be inserted");
	  	  	  	   	  	  temp=s.nextInt();
	  	  	  	   	  	  stack.push(temp);
	  	  	  	   	  	  break;
	  	  	  	   	  case 2: temp=stack.pop();
	  	  	  	   	          System.out.println("element poped: "+temp);
	  	  	  	   	          break;
	  	  	  	   	  case 3: System.out.println("Enter the element to be searched ");
	  	  	  	   	          temp=s.nextInt();
	  	  	  	   	          System.out.println(stack.search(temp));
	  	  	  	   	          break;
	  	  	  	   	  case 4: System.out.println("stack is empty? "+stack.empty());
	  	  	  	   	          break;
	  	  	  	   	  case 5: System.out.println(stack.peek());
	  	  	  	   	          break;
	  	  	  	   	  case 6: System.out.println(stack);
	  	  	  	   	          break;
	  	  	  	   	  case 7: System.out.println("exiting");
	  	  	  	   	          break;
	  	  	  	   	  default: System.out.println("Invalid choice");
	  	  	  	   	  
	  	  	  	   	}
	  	  	  	}while(choice!=7);
	  	  	}
	  	}
	}
