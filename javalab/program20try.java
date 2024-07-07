import java.awt.*;
import java.awt.event.*;

 class MyAWTApp {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("My AWT Application");
        frame.setSize(400, 300); // Set frame dimensions
        frame.setLayout(new FlowLayout()); // Choose a layout manager

        // Create a label
        Label label = new Label("Hello, AWT!");
        frame.add(label); // Add label to the frame

        // Create a button
        Button button = new Button("Click me!");
        frame.add(button); // Add button to the frame

        // Handle button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}

