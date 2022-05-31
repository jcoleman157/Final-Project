import java.awt.*;
import javax.swing.*;


public class BlackjackVisuals {
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    private JFrame FRAME = new JFrame(Constants.mainBlackjackVisual.NAME);
    private JButton START = new JButton(Constants.mainBlackjackVisual.START);

    public BlackjackVisuals() {
    }

    public void prepareGUI() {
        Graphics g;
        FRAME.setSize(WIDTH, HEIGHT);
        FRAME.getContentPane().setLayout(null);
        FRAME.getContentPane().setBackground(Color.GREEN);
        FRAME.setResizable(Constants.mainBlackjackVisual.RESIZABLE);
        FRAME.setLocationRelativeTo(null);
        FRAME.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.drawImage("dog.jpg" ,50, 50, null);
    }

    private void addButton() {

    }

}