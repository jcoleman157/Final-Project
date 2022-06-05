import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BlackjackVisuals implements ActionListener {
    int count = 0;
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    JFrame frame = new JFrame(Constants.mainBlackjackVisual.NAME);
    JButton hit = new JButton(Constants.mainBlackjackVisual.HIT);
    JButton stay = new JButton(Constants.mainBlackjackVisual.STAY);
    ImageIcon image;
    JLabel label = new JLabel("number of clicks" + count);


    public BlackjackVisuals() {
        JPanel panel = new JPanel();
        panel.setSize(WIDTH, HEIGHT);
        panel.setLayout(new GridLayout(0, 1));
        panel.add(hit);
        panel.add(stay);
        hit.setSize(10, 10);
        hit.addActionListener(this);

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        frame.pack();
        frame.setResizable(Constants.mainBlackjackVisual.RESIZABLE);
        frame.getContentPane().setBackground(new Color(64,160,64));
        // frame.setResizable(false);
        // frame.setLocationRelativeTo(null);

    }

    public void startGame() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("number of clicks " + count);
    }
}