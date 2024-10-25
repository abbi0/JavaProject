/*
 * Filename: JavaProject.java
 * Author: Abbigail Rath
 * Created: 10/22/24
 * Purpose: Work with GUI in java
 */

import javax.swing.*;

public class JavaProject{

    // Create variables for the frame, label, button, and field values
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTextField field;

    public JavaProject()
    {
        frame = new JFrame("Example Frame");
        label = new JLabel("Example Label");
        button = new JButton("Example Button");
        field = new JTextField("Example Text Field");

        // Set size of frame
        frame.setSize(600, 600);

        // Set size of label
        label.setBounds(100, 150, 100, 150);

        // Set the measurements of the button
        button.setBounds(150, 200, 220, 50);

        // Set size of field
        field.setBounds(125, 50, 125, 50);

        // Use no Layout managers
        frame.setLayout(null);

        // Make the frame visible
        frame.setVisible(true);


        // Add label, button, and field
        frame.add(label);
        frame.add(button);
        frame.add(field);

    }

    public static void main(String args[]){
        new JavaProject();
    }
}