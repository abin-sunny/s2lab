import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket server = new ServerSocket(5000); // Port number

            System.out.println("Server started. Waiting for a client ...");

            // Accept client connection
            Socket socket = server.accept();

            // Input stream to read data from client
            DataInputStream in = new DataInputStream(socket.getInputStream());

            String received;
            while (true) {
                received = in.readUTF(); // Read data from client
                System.out.println("Received from client: " + received);
                if (received.equals("Over")) {
                    break;
                }
            }

            // Close resources
            in.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
//sudo ufw allow 5000
//to allow port for connection over local network
