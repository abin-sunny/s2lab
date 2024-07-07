import java.util.Scanner;
class Fibanoci implements Runnable
	{
	   private int count;
	   public Fibanoci(int count)
	   	{
	   	  this.count=count;
		}
	   //below thing(@Override isnt necessary its like coding conventions like comments just to mentioning we are overiding a method
	   @Override
	   public void run()
	   	{
	   	  int a=0,b=1,temp;
	   	  System.out.println("Fibonacci numbers: ");
	   	  for(int i=0;i<count;i++)
	   	  	{
	   	  	  System.out.println("Fibanacci series: "+a);
	   	  	  temp=a+b;
	   	  	  a=b;
	   	  	  b=temp;
	   	  	}
	   	}
	}
class Even implements Runnable
	{
	  private int start;
	  private int end;
	  public Even(int start,int end)
	  	{
	  	  this.start=start;
	  	  this.end=end;
	  	}
	  public void run()
	  	{
	  	  int num=start;
	  	  System.out.println("Even numbers between "+start+" and "+end);
	  	  if(end>=start)
	  	  	{
	  	  	  for(;num<=end;num++)
	  	  	  	{
	  	  	  	  if(num%2==0)
	  	  	  	  	{
	  	  	  	  	  System.out.println("even number : "+num);
	  	  	  	  	}
	  	  	  	}
	  	  	  
	  	  	}
	  	  else
	  	  	{
	  	  	  System.out.println("the Range is ill defined");
	  	  	}
	  	}
	}
class program15
	{
	   //the throws isnt necessary just included to call functions like sleep for thread
	   public static void main(String args[]) throws InterruptedException
	   	{
	   	   Scanner s=new Scanner(System.in);
	   	   int fib,e_start,e_end;
	   	   System.out.println("enter the no of fibnacci series");
	   	   fib=s.nextInt();
	   	   System.out.println("enter the range for even numbers");
	   	   e_start=s.nextInt();
	   	   e_end=s.nextInt();
	   	   Thread fibThread=new Thread(new Fibanoci(fib));
	   	   //start thread
	   	   fibThread.start();
	   	   Thread evenThread=new Thread(new Even(e_start,e_end));
	   	   //start thread 
	   	   //both thread runs simultaniously we can use sleep before run method to adjust things
	   	   evenThread.start();
	   	}
	   
	}
	
	
/*
class FibonacciGenerator implements Runnable {
    private int count;

    public FibonacciGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        long a = 0, b = 1;
        System.out.println("Fibonacci numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
        }
    }
}

class EvenNumberDisplay implements Runnable {
    private int start;
    private int end;

    public EvenNumberDisplay(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("\nEven numbers in the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int fibonacciCount = 10; // Number of Fibonacci numbers to generate
        int evenStart = 1; // Start of the even number range
        int evenEnd = 20; // End of the even number range

        // Create threads
        Thread fibonacciThread = new Thread(new FibonacciGenerator(fibonacciCount));
        Thread evenNumberThread = new Thread(new EvenNumberDisplay(evenStart, evenEnd));

        // Start threads
        fibonacciThread.start();
        evenNumberThread.start();
    }
}

*/

/*
Thread Methods:
Here are some commonly used methods for managing threads:
start(): Starts the thread, scheduling it to execute its run() method.
getState(): Returns the state of the thread (e.g., NEW, RUNNABLE, WAITING, etc.).
getName(): Returns the name of the thread.
getPriority(): Returns the priority of the thread.
sleep(long millis): Pauses the thread execution for the specified time (in milliseconds).
join(): Stops the current thread until the called thread terminates.
Thread States:
Threads can be in various states during their lifetime:
New State: A thread is in this state before it starts executing.
Active State: The thread is actively executing its run() method.
Waiting/Blocked State: The thread is waiting for a resource or condition.
Timed Waiting State: Similar to waiting, but with a timeout.
Terminated State: The thread has finished executing (either by returning from run() or due to an unhandled exception).

*/
