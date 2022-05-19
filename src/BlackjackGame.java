import java.util.ArrayList;
import java.util.*;

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
        int userCount = 0;
        getNewDeck();
        shuffleDeck();
        Cards currentCard = drawCard();
        Constants.cardValue cardVal = currentCard.getCardValue();
        userCount += userCardValue(cardVal);
        currentCard = drawCard();
        cardVal = currentCard.getCardValue();
        userCount += userCardValue(cardVal);
        System.out.println("User hand : " + userCount);
    }

    /**
     * This will draw 52 * numOfCards cards
     */
    private void getNewDeck() {
        for(int g = 1; g <= numOfDecks; g++){
        for (int i = 1; i <= 13; i++) {
            for (int k = 1; k <= 4; k++) {
                Cards card = new Cards(i, k);
                arrList.add(card);
            }
        }
    }
    }
    /**
     * shuffles deck
     */
    private void shuffleDeck() {
        for (int i = 0; i < 1000; i++) {
            int location1 = (int) Math.floor((Math.random() * arrList.size()));
            int location2 = (int) Math.floor((Math.random() * arrList.size()));
            Cards tmp = arrList.get(location1);
            arrList.set(location1, arrList.get(location2));
            arrList.set(location2, tmp);
        }
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
        for (int i = 0; i < arrList.size(); i++){
            System.out.println("Card : Value = " + arrList.get(i).getCardValue() + ", Suite = " + arrList.get(i).getCardSet());
        }
    }

    private Cards drawCard() {
        return arrList.remove(0);
    }

    private int userCardValue(Constants.cardValue val) {
        if (val.equals(Constants.cardValue.ACE)) {
            return userOneOrElev();
        }
        if (val.equals(Constants.cardValue.KING) || val.equals(Constants.cardValue.QUEEN)
                || val.equals(Constants.cardValue.JACK) || val.equals(Constants.cardValue.TEN)) {
            return 10;
        }
        if (val.equals(Constants.cardValue.NINE)) {
            return 9;
        }
        if (val.equals(Constants.cardValue.EIGHT)) {
            return 8;
        }
        if (val.equals(Constants.cardValue.SEVEN)) {
            return 7;
        }
        if (val.equals(Constants.cardValue.SIX)) {
            return 6;
        }
        if (val.equals(Constants.cardValue.FIVE)) {
            return 5;
        }
        if (val.equals(Constants.cardValue.FOUR)) {
            return 4;
        }
        if (val.equals(Constants.cardValue.THREE)) {
            return 3;
        }
        if (val.equals(Constants.cardValue.TWO)) {
            return 2;
        }
        return -1; // SHOULD be unreachable this is just in case, can never be too carful
    }
    private int userOneOrElev(){
        Scanner scan = new Scanner(System.in);
        System.out.println("type Y for one, N for elevin");
        String answerElevOrOne = scan.nextLine();
        if(answerElevOrOne.charAt(0) == 'y' || answerElevOrOne.charAt(0) == 'Y'){
            return 1;
        }
        else 
            return 11;
    }
}
