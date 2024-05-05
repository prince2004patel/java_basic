
import java.awt.event.*;

class Other implements ActionListener {

    Event_handling_outer_class Obj;

    Other(Event_handling_outer_class Obj) {
        this.Obj =  Obj;
    }

    public void actionPerformed(ActionEvent e)
    {
        // setting text from different class
        Obj.textField.setText("Using Different Classes");
    }
}