//FlowLayout is a simple layout manager that arranges components in a row, left to right, wrapping to the next line as needed. 
//It is ideal for scenarios where components need to maintain their natural sizes and maintain a flow-like structure.

import javax.swing.*;
import java.awt.*;

public class Flow_Layout {

    public static void main(String[] args) {
    JFrame frame = new JFrame("FlowLayout Example");
    frame.setLayout(new FlowLayout());
    frame.add(new JButton("Button 1"));
    frame.add(new JButton("Button 2"));
    frame.add(new JButton("Button 3"));
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
