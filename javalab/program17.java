import java.util.PriorityQueue;
import java.util.Scanner;
class program17
	{
	  public static void main(String args[])
	  	{
	  	  PriorityQueue<Integer> queue=new PriorityQueue<>();
	  	  int choice,ins,dlt;
	  	  Scanner s=new Scanner(System.in);
	  	  do{
	  	      System.out.println("Enter your choice\n1.insert\n2.delete\n3.display\n4.exit");
	  	      choice=s.nextInt();
	  	      switch(choice)
	  	      	{
	  	      	  case 1: System.out.println("Enter the value to be inserted");
	  	      	  	  ins=s.nextInt();
	  	      	  	  queue.add(ins);
	  	      	  	  break;
	  	      	  case 2: dlt=queue.remove();
	  	      	  	  System.out.println("removed element: "+dlt);
	  	      	  	  break;
	  	      	  case 3: System.out.println(queue);
	  	      	  	  break;
	  	      	  case 4: System.out.println("exiting...");
	  	      	          break;
	  	      	  default: System.out.println("invalid choice");
	  	      	}
	  	    }while(choice!=4);
	  	}
	}
