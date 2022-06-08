import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class BlackjackVisuals implements ActionListener {
    private Scanner scan = new Scanner(System.in);
    public static int count = 0;
    private JButton[] functions = new JButton[2];
    private int WIDTH = Constants.mainBlackjackVisual.WIDTH;
    private int HEIGHT = Constants.mainBlackjackVisual.HEIGHT;
    private int y = Constants.mainBlackjackVisual.Y;
    private int caseWorks;
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
        frame.add(label);
        label.setForeground(Color.WHITE);

        functions[0] = hit;
        functions[1] = stay;
        int x = 0;
        for(int i = 0; i < functions.length; i++){
            functions[i].addActionListener(this);
            functions[i].setFocusable(false);
            functions[i].setBounds(x,y,80,30);
            frame.add(functions[i]);
            x+=85;
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        frame.setResizable(Constants.mainBlackjackVisual.RESIZABLE);
        frame.getContentPane().setBackground(new Color(64, 160, 64));
        label.setBounds(x - 120, y - 80, 1000, 100);
        frame.add(label);
        int test = scan.nextInt();
    }

    public void startGame() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == hit){
            count++;
            System.out.println("43");
        }
         else if(src == stay){
            count--;
            label.setText("number of clicks " + count);
        }
    }
}