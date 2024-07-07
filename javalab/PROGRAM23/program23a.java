import java.io.*;
import java.util.Scanner;

 class program23a {
    public static void main(String[] args) {
        // Create a File object for the specified file name
        File file = new File("wildr.txt");

        try {
            // Create a new file if it doesn't exist
            boolean isNewFile = file.createNewFile();
            if (isNewFile) {
                System.out.println("New file 'wildr.txt' created.");
            } else {
                System.out.println("The file 'wildr.txt' already exists.");
            }

            // Read data from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter data to write to the file: enter 'Over' to stop ");
            String userInput = reader.readLine();
             //FileWriter writer = new FileWriter(file);
             FileWriter writer = new FileWriter(file, true);
             //if u want to append rather than rewrite
            while(!userInput.equals("Over"))
            	{
            	 
                  writer.write(userInput+"\n");
                  System.out.println("Enter the next Line");
                  userInput = reader.readLine();
                  
            	}

            // Write the user input to the file
            
            writer.close();

            System.out.println("Data written to 'wildr.txt'.");
            
            System.out.println("lets read those data");
          
          //code to read data from file
          Scanner s=new Scanner(file);
          //here file is the object   we have created easrlier wildr.txt
          while(s.hasNextLine())
          	{
          	  System.out.println(s.nextLine());
          	}
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

