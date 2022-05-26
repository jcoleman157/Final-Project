import java.awt.*;
import javax.swing.*;

public class BlackjackVisuals {
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    JFrame FRAME = new JFrame(Constants.mainBlackjackVisual.NAME);
    JButton START = new JButton(Constants.mainBlackjackVisual.START);

    public BlackjackVisuals() {

    }

    public void prepareGUI() {
        FRAME.setTitle(Constants.mainBlackjackVisual.NAME);
        FRAME.setSize(WIDTH, HEIGHT);
        FRAME.getContentPane().setLayout(null);
        FRAME.getContentPane().setBackground(Color.GREEN);
        FRAME.setResizable(false);
        FRAME.setLocationRelativeTo(null);
        FRAME.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addButton() {

    }

}