import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HitButton implements ActionListener{
    JButton hit = new JButton(Constants.mainBlackjackVisual.HIT);
    JLabel label = new JLabel();

    public HitButton() {
        hit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BlackjackVisuals.count++;
        label.setText("number of clicks " + BlackjackVisuals.count);        
    }
    
}
