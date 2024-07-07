class Cpu
     {
       double price;
       //constructor of Cpu
       Cpu(double price)
       	   {
       	     this.price=price;
       	   }
       void display()
       	    {
       	       System.out.println("price: "+price);
       	    }
      //non static nested class
       class Processor
       	     {
       	       int cores;
       	       String manufacture;
       	       //constructor of Processor
       	       Processor(int cores,String manufacture)
       	             {
       	                this.cores=cores;
       	                this.manufacture=manufacture;
       	                //we can manupulate upper class data like this.so namuk upper classile value and lower clasile value set akanel lower classil oru function create akiyal mathi
       	                price=500;
       	             }
       	       void get_processor()
       	       	    {
       	       	      System.out.println("cores: "+cores+"\n manufature: "+manufacture+"\nprice: "+price);
       	       	    }
       	     }
       //static nested class
       static class Ram
       	     {
       	       int memory;
       	       String manufacture;
       	       //constructor
       	       Ram(int memory,String manufacture)
       	       	   {
       	       	      this.memory=memory;
       	       	      this.manufacture=manufacture;
       	       	   }
       	       void get_ram()
       	       	    {
       	       	      System.out.println("RAM \nsize: "+memory+"\nManufacture: "+manufacture); 
       	       	    }
       	     }
       	     
       
      
     }
class program5
	{
	  public static void main(String args[])
	  	{
	  	  Cpu asus=new Cpu(999);
	  	  asus.display();
	  	  Cpu.Processor i5=asus.new Processor(8,"Intel");
	  	  i5.get_processor();
	  	  Cpu.Ram ddr3=new Cpu.Ram(16,"seagate");
	  	  ddr3.get_ram();
	  	}
	}
/*
OUTPUT
price: 999.0
cores: 8
 manufature: Intel
price: 500.0
RAM 
size: 16
Manufacture: seagate
*/
	  
