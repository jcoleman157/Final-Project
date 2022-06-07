public class Constants {
    // what type of card it is so we can count cards while playing
    public enum cardValue {
        ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO;
    }

    // what type of card it is so we can count cards while playing
    public enum cardSet {
        HEART, DIAMOND, SPADE, CLUB;
    }

    public class mainBlackjackVisual {
        // Dimentions for the frame
        public static final int WIDTH = 1800;
        public static final int HEIGHT = 700;
        // y value for the buttons
        public static final int Y = 600;
        // Swing for some reason requires a bool to see if frame is visible. ALWAYS TRUE
        public static final boolean VISFRAME = true;
        // This will decide weather the jFrame is resizable by the users
        public static final boolean RESIZABLE = true;
        // What the name of the box that pops up is. Should be what it is you're looking
        // at. (may change to "Cardgame")
        public static final String NAME = "BLACKJACK";
        // This is the text for the hit button
        public static final String HIT = "Hit";
        // This is the text for the hit button
        public static final String STAY = "Stay";
    }

    public class mainBlackjackGame {
        // the number of decks used for counting cards. default is six because this is
        // how pro blackjack is played
        public final static int NUMOFDECKS = 6;
        // What the user start off with for money, they choose amount and this updates
        public final static int STARTINGVAL = 1000;
    }
}
