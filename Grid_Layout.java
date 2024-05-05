//GridLayout arranges components in a grid with a specified number of rows and columns. Each cell in the grid can hold a component. 
//This layout manager is ideal for creating a uniform grid of components, such as a calculator or a game board.

import javax.swing.*;
import java.awt.*;

public class Grid_Layout {
    public static void main(String[] args) {
    JFrame frame = new JFrame("GridLayout Example");
    frame.setLayout(new GridLayout(3, 3));
    for (int i = 1; i <= 9; i++) {
        frame.add(new JButton("Button " + i));
    }
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
