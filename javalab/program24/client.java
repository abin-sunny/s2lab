//for using input and output stream
import java.io.*;
//It allows you to use classes related to networking, such as Socket, ServerSocket, URL, etc.
//we use socket for client server communication
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Establish a socket connection
            Socket socket = new Socket("127.0.0.1", 5000); // IP address and port
            /*ip adress 127.0.0.1 is loop back address.that means  connecting to the local machine (your own computer). 
            and u can use any valid port number (avoid reserved port number such as https 443 etc if u are not using those services
            the only constrain using the port number is client and server port number should be same for communication
            */

            // Input stream to read user input
            DataInputStream input = new DataInputStream(System.in);

            // Output stream to send data to the server
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line = "";
            while (!line.equals("Over")) {
                line = input.readLine(); // Read input from user
                out.writeUTF(line); // Send data to server   ..   write UFT means senting that in UFT-8 decoding
            }

            // Close resources
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

