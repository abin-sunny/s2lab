
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Scannerdemo {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter first Number: ");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter second Number: ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("sum = " + (a + b));
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
