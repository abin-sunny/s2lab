class ClassA
     {
       void dispA()
       	    {
       	      System.out.println("disp() method of class A");
       	    }
     }
class ClassB extends ClassA
     {
       void dispB()
       	    {
       	      System.out.println("disp() method of class B");
       	    }
     }
class SingleInheritanceDemo
      {
        public static void main(String args[])
           {
             ClassB b= new ClassB();
             //call dispA
             b.dispA();
             //call dispB
             b.dispB();
           }
      }
	  
