import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class blackjack{
    JFrame FRAME = new JFrame(Constants.mainBlackjack.NAME);
    JButton START = new JButton(Constants.mainBlackjack.START);

    public blackjack(){

    }
    public blackjack(int numOfDecks){
        
    }
    public void startup(){
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setSize(Constants.mainBlackjack.WIDTH, Constants.mainBlackjack.HEIGHT);
        FRAME.setVisible(Constants.mainBlackjack.VISFRAME);
        addButton();
    }
    private void addButton(){
        START.setBounds(130, 130, 40, 40);;
        FRAME.getContentPane().add(START);

    }
    
}