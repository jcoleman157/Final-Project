import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BlackjackVisuals{
    public static int count = 0;
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    JFrame frame = new JFrame(Constants.mainBlackjackVisual.NAME);
    ImageIcon image;
    JLabel label = new JLabel("number of clicks" + count);


    public BlackjackVisuals() {
        JPanel panel = new JPanel();
        panel.setSize(WIDTH, HEIGHT);
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        HitButton hit = new HitButton();
        StayButton stay = new StayButton();
        panel.add(hit.hit);
        panel.add(stay.stay);
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

}