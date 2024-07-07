import java.awt.*;
import java.awt.event.*;

public class SimpleAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Example");
        Button button = new Button("Click Me");

        // Add the button to the frame
        frame.add(button);

        // Create an action listener for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

