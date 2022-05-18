import java.util.ArrayList;


public class BlackjackGame {
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
        for(int j = 0 ; j < numOfDecks; j++){
            for(int i = 1; i <= 13; i++){
                for(int k = 1; k <= 4; k++){
                    Cards card = new Cards(i, k);
                    arrList.add(card);
                }
            }
        }
        for(int l = 0; l<10; l++)
            System.out.println();
        shuffleDeck();
    }
    /**
     * This will shuffle the deck
     */
    private void shuffleDeck(){
	    for (int i = 0; i < 1000; i++){
		    int location1 = (int) Math.floor((Math.random() * arrList.size()));
		    int location2 = (int) Math.floor((Math.random() * arrList.size()));
		    Cards tmp = arrList.get(location1);
		    arrList.set(location1 , arrList.get(location2));
		    arrList.set(location2, tmp);
	    }
        for(int k = 0; k < arrList.size(); k++){
            System.out.println("Card : Value = " + arrList.get(k).getCardValue() + ", Suite = " + arrList.get(k).getCardSet());
        }
    }
    private Cards drawCard(){
        return arrList.remove(0);
    }
}

