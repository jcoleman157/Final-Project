/**
 * this class makes it so we can get the card types from Constants and the
 * values
 * 
 * @param val  must be between 1-13
 * @param type must be between 1-4
 *             https://www.dreamincode.net/forums/topic/116864-how-to-make-a-poker-game-in-java/
 *             - refernece
 */
public class Cards {
    Constants.cardValue cardVal;
    Constants.cardSet cardType;

    public Cards(int val, int type) {
        if(val == 1){
            cardVal = Constants.cardValue.ACE;
        }
        if(val == 2){
            cardVal = Constants.cardValue.KING;
        }
        if(val == 3){
            cardVal = Constants.cardValue.QUEEN;
        }
        if(val == 4){
            cardVal = Constants.cardValue.JACK;
        }
        if(val == 5){
            cardVal = Constants.cardValue.TEN;
        }
        if(val == 6){
            cardVal = Constants.cardValue.NINE;
        }
        if(val == 7){
            cardVal = Constants.cardValue.EIGHT;
        }
        if(val == 8){
            cardVal = Constants.cardValue.SEVEN;
        }
        if(val == 9){
            cardVal = Constants.cardValue.SIX;
        }
        if(val == 10){
            cardVal = Constants.cardValue.FIVE;
        }
        if(val == 11){
            cardVal = Constants.cardValue.FOUR;
        }
        if(val == 12){
            cardVal = Constants.cardValue.THREE;
        }
        if(val == 13){
            cardVal = Constants.cardValue.TWO;
        }
        if(type == 1){
            cardType = Constants.cardSet.HEART;
        }
        if(type == 2){
            cardType = Constants.cardSet.DIAMOND;
        }
        if(type == 3){
            cardType = Constants.cardSet.SPADE;
        }
        if(type == 4){
            cardType = Constants.cardSet.CLUB;
        }
        
    }
}