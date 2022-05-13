import java.util.ArrayList;
import java.util.Random;


public class BlackjackGame {
    private Random rand = new Random();
    private int numOfDecks; 
    public BlackjackGame() {
        numOfDecks = Constants.mainBlackjackGame.NUMOFDECKS;
    }

    public BlackjackGame(int numOfDecks) {
        this.numOfDecks = numOfDecks;
    }

    public int getNumOfDecks() {
        return numOfDecks;
    }

    public void setNumOfDecks(int numOfDecks) {
        this.numOfDecks = numOfDecks;
    }
    /**
     * This is the "logic" for the game, NEED TO MAKE IT SO WE CAN COUNT CARDS
     */
    public void gameLogic() {

    }

}
