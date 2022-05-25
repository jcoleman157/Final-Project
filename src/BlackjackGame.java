import java.util.ArrayList;
import java.util.*;

public class BlackjackGame {
    private int numOfDecks;
    private int userCount = 0;
    private int dealerCount = 0;
    private int money;
    private int aceCounter = 0;
    private int firstTime = 0;
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
        if(firstTime == 0){
            getNewDeck();
            shuffleDeck();
            firstTime++;
        }
        int bet = userBet();
        startUp();
        userDraw(bet);
        
        if(userBust(bet)){
            dealerDraw(bet);
        }
        if(keepPlaying()){
            userCount = 0;
            gameLogic();
        }
    }

    /**
     * This will draw 52 * numOfDecks cards
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
        for (int i = 0; i < arrList.size(); i++){
        System.out.println("Card : Value = " + arrList.get(i).getCardValue() + 
        ", Suite = " + arrList.get(i).getCardSet());
         }
    }

    private Cards drawCard() {
        return arrList.remove(0);
    }
    /**
     * This method takes the enum value and converts it to a real value
     * @param val - What the card value is
     * @return the value of the card
     */
    private int numberValue(Constants.cardValue val) {
        if (val.equals(Constants.cardValue.ACE)) {
            aceCounter++;
            return oneOrElev();
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

    private int oneOrElev(){
        if (userCount <= 10) {
            return 11;
        }
        else{
            return 1;
        }
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
    private void addAndSubtractMoney(char result, int bid){
        if(result == 'w'){
            money += bid;
            System.out.println("You won " + bid + " , current amount is " + money);
            return;
        }
        else if(result == 'l'){
            money -= bid;
            System.out.println("You lost " + bid + " , current amount is " + money);
            return;
        }
        else{
            System.out.println("Push, no one lost");
        }
    }
    /**
     * Checks if user busts
     * @param bet - amount user bet
     */
    private boolean userBust(int bet){
        aceChanger();
            if(userCount > 21){
            return false;
        }
        return true;
    }
    /**
     * makes it so if user busts but they have an ace it will subtract 10
     */
    private void aceChanger(){
        if(userCount > 21 && aceCounter != 0){
            userCount -= 10;
            aceCounter--;
        }
    }
    /**
     * just prints the card
     * @param card - card
     */
    private void printCard(Cards card){
        System.out.println("Card : Value = " + card.getCardValue() + ", Suite = " + card.getCardSet()); 
    }
    /**
     * just prints the dealers card
     * @param card - dealers card
     */
    private void printDealerCard(Cards card){
        System.out.println("Dealers Card - Card : Value = " + card.getCardValue() + ", Suite = " + card.getCardSet()); 
    }

    private void dealerDraw(int bet){
        while(dealerCount <= 16){
        Cards card = drawCard();
        dealerCount += numberValue(card.getCardValue());
        printDealerCard(card);
        System.out.println("Dealers Count " + dealerCount);
        }
        if(dealerCount > 21){
            addAndSubtractMoney('w', bet);
        }
        if(dealerCount > userCount && dealerCount <= 21){
            addAndSubtractMoney('l', bet);
        }
        if(dealerCount < userCount){
            addAndSubtractMoney('w', bet);
        }
        else 
            addAndSubtractMoney('p', bet);
    }

    private void userDraw(int bet){
        boolean keepPlaying = true;
        Constants.cardValue cardVal;
        Cards card;
        while(keepPlaying){
            System.out.println("User hand : " + userCount);
            keepPlaying = hitOrStay();
            if (keepPlaying) {
                card = drawCard();
                printCard(card);
                cardVal = card.getCardValue();
                userCount += numberValue(cardVal);
                keepPlaying = userBust(bet);
            }
        }
    }
    /**
     * This will be the startup
     */
    private void startUp(){
        Cards currentCard = drawCard();
        Cards dealerCard = drawCard();
        printDealerCard(dealerCard);
        printCard(currentCard);
        Constants.cardValue cardVal = currentCard.getCardValue();
        Constants.cardValue dealerCardVal = dealerCard.getCardValue();
        dealerCount += numberValue(dealerCardVal);
        userCount += numberValue(cardVal);
        currentCard = drawCard();
        printCard(currentCard);
        cardVal = currentCard.getCardValue();
        userCount += numberValue(cardVal);
    }
}