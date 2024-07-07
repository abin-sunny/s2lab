import java.io.DataInputStream;
class Student
	{
	  int rollno;
	  void getRollno(int x)
	  	{
	  	  rollno=x;
	  	}
	  void putRollno()
	  	{
	  	  System.out.println("Roll Number: "+rollno);
	  	}
	}
class Test extends Student
	{//single inheritance
	  int mark1,mark2;
	  void getMark(int x,int y)
	  	{
	  	  mark1=x;
	  	  mark2=y;
	  	}
	  void putMarks()
	  	{
	  	  System.out.println("mark 1:"+mark1);
	  	  System.out.println("mark 2:"+mark2);
	  	}
	}
interface Sports
	{//defining interface
	  final float spwtmarks=6.5f;
	  void putSportMarks();
	}
class Score extends Test implements Sports
	{ //implememting interfaces
	 public void putSportsMark()
	 	{
	 	  float total=mark1+mark2+spwtmarks;
	 	  System.out.println("Total Marks:"+total);
	 	}	    
	 }
class StudentInterface
	{
	   public static void main(String args[])
	   	{
	   	   try
	   	   	{
	   	   	  DataInputStream in=new DataInputStream(System.in);
	   	   	  Score s=new Score();
	   	   	  System.out.println("Enter Rollno");
	   	   	  int rn=Integer.parseInt(in.readLine());
	   	   	  s.getRollno(rn);
	   	   	  System.out.println("Enter Mark1:");
	   	   	  int m1=Integer.parseInt(in.readLine());
	   	   	   System.out.println("Enter Mark2:");
	   	   	  int m2=Integer.parseInt(in.readLine());
	   	   	  s.getMark(m1,m2);
	   	   	  s.putRollno();
	   	   	  s.putMark();
	   	   	  s.putSportsMark();
	   	   	  s.putTotalMarks();
	   	   	}catch(Exception e){}
	   	   	
	   	   	  
	   	   	
	   	}
	}
