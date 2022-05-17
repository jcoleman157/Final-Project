import java.util.ArrayList;
import java.util.Random;


public class BlackjackGame {
    private Random rand = new Random();
    private int numOfDecks; 
    private ArrayList<Cards> arrList;
    public BlackjackGame() {
        numOfDecks = Constants.mainBlackjackGame.NUMOFDECKS;
        arrList = new ArrayList<Cards>();
    }

    public BlackjackGame(int numOfDecks) {
        this.numOfDecks = numOfDecks;
        arrList = new ArrayList<Cards>();
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
        drawDeck();
    }
    /**
     * This will draw 52 * numOfCards cards (numOfCards hard and dont work at this moment)
     */
    private void drawDeck(){
        for(int i = 1; i <= 13; i++){
            for(int k = 1; k <= 4; k++){
                Cards card = new Cards(i, k);
                arrList.add(card);
            }
        }
    }
    private void shuffleDeck(){
	    for (int i = 0; i < 1000; i++){
		    double location1 = Math.floor((Math.random() * arrList.size()));
		    double location2 = Math.floor((Math.random() * arrList.size()));
		    Cards tmp = arrList.get(location1);

		    arrList.get(location1) = arrList.get(location2);
		    arrList.get(location2) = tmp;
            // BROKEN
	    }
    }
}

