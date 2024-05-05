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