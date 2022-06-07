import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BlackjackVisuals implements ActionListener {
    public static int count = 0;
    private JButton[] functions = new JButton[2];
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    private JButton hit,stay;
    private JFrame frame = new JFrame(Constants.mainBlackjackVisual.NAME);
    private ImageIcon image;
    private JLabel label = new JLabel("number of clicks " + count);

    public BlackjackVisuals() {
        JPanel panel = new JPanel();
        frame.setSize(WIDTH, HEIGHT);
        frame.setLayout(null);
        hit = new JButton(Constants.mainBlackjackVisual.HIT);
        stay = new JButton(Constants.mainBlackjackVisual.STAY);

        functions[0] = hit;
        functions[1] = stay;
        int x = 0;
        int y = 0;
        for(int i = 0; i < functions.length; i++){
            functions[i].addActionListener(this);
            functions[i].setFocusable(false);
            functions[i].setBounds(x,y,50,50);
            frame.add(functions[i]);
            x+=50;
        }



        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        frame.setResizable(Constants.mainBlackjackVisual.RESIZABLE);
        frame.getContentPane().setBackground(new Color(64, 160, 64));
        // frame.setResizable(false);
        // frame.setLocationRelativeTo(null);

    }

    public void startGame() {
    }

    @Override
    public void actionPerformed(ActionEvent hit) {
        // TODO Auto-generated method stub
        count++;
    }
}