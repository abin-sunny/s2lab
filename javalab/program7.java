class program7
	{
	  public static void main(String args[])
	  	{
	  	   String a="hello WORLD",a2="hello",a3="hello",a4="    hello   ";
	  	    System.out.println("Initial string : "+a);
	  	   System.out.println("length: "+a.length());
	  	   System.out.println("character at position 4: "+a.charAt(3));
	  	   //a=a.concat(".Its java time");
	  	   a=a+".Its java time.world is changing";
	  	   System.out.println("current string after concatination: "+a);
	  	   System.out.println("is a2 ->"+a2+" and a3->"+a3+" equals: "+a2.equals(a3));
	  	   System.out.println("hello and HELLO  : "+"Hello".equals("HELLO") );
	  	   System.out.println("hello and HELLO  ignoringcase: "+"Hello".equalsIgnoreCase("HELLO") );
	  	   //substring
	  	   System.out.println("substing(5) using with\" "+a+"\"->"+a.substring(5));
	  	    System.out.println("substing(5,10) using with \""+a+"\"->"+a.substring(5,10));
	  	    System.out.println("index of first occurence of \"world\" in \""+a+"\"->"+a.indexOf("world"));
	  	    System.out.println("index of last occurence of \"world\" in \""+a+"\"->"+a.lastIndexOf("world"));
	  	    System.out.println("replacing o with e -> "+a.replace("o","e"));
	  	    System.out.println(a);
	  	     System.out.println("is \""+a+"\" starts with \"hello\": "+a.startsWith("hello"));
	  	     System.out.println("is \""+a+"\" ends with \"changing\": "+a.endsWith("changing"));
	  	      System.out.println("to upper case : "+a.toUpperCase());
	  	     System.out.println("to upper case : "+a.toLowerCase());
	  	     System.out.println("trim function on \" "+a4+"\"->"+a4.trim());
	  	     //split(String regex): Splits this string around matches of the given regular expression
	  	     String str = "one,two,three";
                     String[] parts = str.split(",");
                     System.out.println("The string is : "+str);
                     System.out.println("after spliting based on \',\':");
                     for(String part : parts)
                     	{
                     	  System.out.println(part);
                     	}
                     	
                    //contains(CharSequence s): Returns true if the string contains the specified sequence of characters.
                    System.out.println("The string \"hello how are u?\" contains \"how\" :"+"hello how are u?".contains("how"));
	  	    
	  	}
	}

