import java.util.Scanner;
class Fibanoci implements Runnable
	{
	   private int count;
	   String msg;
	   public Fibanoci(int count,String msg)
	   	{
	   	  this.count=count;
	   	  this.msg=msg;
		}
	   @Override
	   public void run()
	   	{
	   	  int a=0,b=1,temp;
	   	  System.out.println("Fibonacci numbers: ");
	   	  for(int i=0;i<count;i++)
	   	  	{
	   	  	  System.out.println("Fibanacci series: "+a+"from thread: "+msg);
	   	  	  temp=a+b;
	   	  	  a=b;
	   	  	  b=temp;
	   	  	}
	   	}
	}
class program15
	{
	   public static void main(String args[]) throws InterruptedException
	   	{
	   	   Scanner s=new Scanner(System.in);
	   	   int fib;
	   	   System.out.println("enter the no of fibnacci series");
	   	   fib=s.nextInt();
	   	   Thread fibThread=new Thread(new Fibanoci(fib,"thread1"));
	   	   //start thread
	   	   fibThread.start();
	   	   Thread fibThread2=new Thread(new Fibanoci(fib+100,"thread2"));
	   	   //start thread
	   	   fibThread2.start();
	   	   System.out.println(fibThread.getState());
	   	   System.out.println(fibThread.getName());
	   	   System.out.println(fibThread.getState());System.out.println(fibThread.getState());
	   	   fibThread.sleep(1000);
	   	   System.out.println(fibThread.getState());System.out.println(fibThread.getState());System.out.println(fibThread.getState());System.out.println(fibThread.getState());System.out.println(fibThread.getState());
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
