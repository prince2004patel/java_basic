import java.awt.*;
import java.awt.event.*;

class Event_handling_outer_class extends Frame {

    TextField textField;

    Event_handling_outer_class()
    {
        // Component Creation
        textField = new TextField();

        // setBounds method is used to provide
        // position and size of component
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);

        Other other = new Other(this);

        // Registering component with listener
        // Passing other class as reference
        button.addActionListener(other);

        // add Components
        add(textField);
        add(button);

        // set visibility
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Event_handling_outer_class();
    }
}
//see the file other
