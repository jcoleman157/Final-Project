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

    public void gameLogic() {
        int cardVal = rand.nextInt(13) + 1;
        int cardType = rand.nextInt(4) + 1;
    }
}
