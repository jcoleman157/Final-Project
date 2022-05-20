import java.util.ArrayList;
import java.util.*;

public class BlackjackGame {
    private int numOfDecks;
    private int money;
    private ArrayList<Cards> arrList;

    public BlackjackGame() {
        numOfDecks = Constants.mainBlackjackGame.NUMOFDECKS;
        money = Constants.mainBlackjackGame.STARTINGVAL;
        arrList = new ArrayList<Cards>();
    }

    public BlackjackGame(int numOfDecks, int money) {
        this.numOfDecks = numOfDecks;
        this.money = money;
        arrList = new ArrayList<Cards>();
    }

    public int getNumOfDecks() {
        return numOfDecks;
    }

    public void setNumOfDecks(int numOfDecks) {
        this.numOfDecks = numOfDecks;
    }

    /**
     * This is the "logic" for the game
     */
    public void gameLogic() {
        int userCount = 0;
        boolean keepPlaying = true;
        getNewDeck();
        shuffleDeck();
        int bet = userBet();
        Cards currentCard = drawCard();
        Constants.cardValue cardVal = currentCard.getCardValue();
        userCount += userCardValue(cardVal);
        currentCard = drawCard();
        cardVal = currentCard.getCardValue();
        userCount += userCardValue(cardVal);
        while (keepPlaying) {
            System.out.println("User hand : " + userCount);
            keepPlaying = hitOrStay();
            if (keepPlaying) {
                currentCard = drawCard();
                cardVal = currentCard.getCardValue();
                userCount += userCardValue(cardVal);
                if(userCount > 21){
                    keepPlaying = false;
                    addAndSubtractMoney(false, bet);
                    System.out.println("You bust! You lost " + bet);
                }
            }
        }
        if(keepPlaying()){
            gameLogic();
        }
    }

    /**
     * This will draw 52 * numOfCards cards
     */
    private void getNewDeck() {
        for (int g = 1; g <= numOfDecks; g++) {
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
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        // for (int i = 0; i < arrList.size(); i++){
        // System.out.println("Card : Value = " + arrList.get(i).getCardValue() + ",
        // Suite = " + arrList.get(i).getCardSet());
        // }
    }

    private Cards drawCard() {
        return arrList.remove(0);
    }
    /**
     * This method takes the enum value and converts it to a real value
     * @param val - What the card value is
     * @return the value of the card
     */
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

    private int userOneOrElev() {
        Scanner scan = new Scanner(System.in);
        System.out.println("type Y for one, N for elevin");
        String answerElevOrOne = scan.nextLine();
        if (answerElevOrOne.charAt(0) == 'y' || answerElevOrOne.charAt(0) == 'Y') {
            return 1;
        } else
            return 11;
    }

    private boolean hitOrStay() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hit or Stay? (H for hit, S for stay) ");
        char hitOrStay = scan.nextLine().charAt(0);
        if (hitOrStay == 'H' || hitOrStay == 'h') {
            return true;
        } else {
            return false;
        }
    }
    private boolean keepPlaying(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Play again? (Y for yes, N for no) ");
        char keepPlaying = scan.nextLine().charAt(0);
        if(keepPlaying == 'y' || keepPlaying == 'Y'){
            return true;
        }
        else{
            return false;
        }
    }
    private int userBet(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Current amount: " + money);
        System.out.print("What do you want to bet? ");
        return scan.nextInt();
    }
    /**
     * This takes the bid and adds or subtracts the money
     * @param result weather the user wins, loses, or pushes
     * @param bid the amount that got bet
     */
    private void addAndSubtractMoney(boolean result, int bid){
        if(result){
            money += bid;
        }
        else if(!result){

            money -= bid;
        }
        else{
            System.out.println("Push, no one lost");
        }
    }
    private int dealerHand(Constants.cardValue val){
        if (val.equals(Constants.cardValue.ACE)) {
            return 11;
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
}
