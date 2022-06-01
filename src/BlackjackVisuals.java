import java.awt.*;
import javax.swing.*;


public class BlackjackVisuals {
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    private JFrame FRAME = new JFrame(Constants.mainBlackjackVisual.NAME);
    private JButton START = new JButton(Constants.mainBlackjackVisual.START);
    private Graphics g = FRAME.getGraphics();
    public BlackjackVisuals() {
        
    }

    public void prepareGUI() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image img = t.getImage("dog.jpg");
        FRAME.setSize(WIDTH, HEIGHT);
        FRAME.getContentPane().setLayout(null);
        FRAME.getContentPane().setBackground(Color.GREEN);
        FRAME.setResizable(Constants.mainBlackjackVisual.RESIZABLE);
        FRAME.setLocationRelativeTo(null);
        FRAME.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.getGraphics();
        g.drawImage(img ,0, 0, null);
    }

    private void addButton() {

    }

}