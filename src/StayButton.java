import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StayButton implements ActionListener{
    JButton stay = new JButton(Constants.mainBlackjackVisual.STAY);
    JLabel label = new JLabel();

    public StayButton() {
        stay.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BlackjackVisuals.count--;
        label.setText("number of clicks " + BlackjackVisuals.count);        
    }
}
