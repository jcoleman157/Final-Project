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
        public static final int WIDTH = 800;
        public static final int HEIGHT = 800;
        // Swing for some reason requires a bool to see if frame is visible. ALWAYS TRUE
        public static final boolean VISFRAME = true;
        // What the name of the box that pops up is. Should be what it is you're looking
        // at. (may change to "Cardgame")
        public static final String NAME = "BLACKJACK";
        // This is the text for the start button
        public static final String START = "Start";
    }
    public class mainBlackjackGame {
        // the number of decks used for counting cards. default is one so one of each
        // set will show up. if 2 than 2 will show
        public final static int NUMOFDECKS = 1;
    }
}
