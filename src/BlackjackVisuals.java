import javax.swing.*;
public class BlackjackVisuals{
    JFrame FRAME = new JFrame(Constants.mainBlackjackVisual.NAME);
    JButton START = new JButton(Constants.mainBlackjackVisual.START);

    public BlackjackVisuals(){
        
    }
    public void startup(){
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setSize(Constants.mainBlackjackVisual.WIDTH, Constants.mainBlackjackVisual.HEIGHT);
        FRAME.setVisible(Constants.mainBlackjackVisual.VISFRAME);
        addButton();
        
    }
    private void addButton(){
        
    }
    
}