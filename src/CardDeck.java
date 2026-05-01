import java.util.Random;

public class CardDeck {

    private Random random;

    public CardDeck() {
        random = new Random();
    }

    public int drawChanceCard(int currentPosition) {
        int card = random.nextInt(16);

        switch (card) {
            case 0:
                return Board.GO;
            case 1:
                return Board.JAIL;
            case 2:
                return 11; // St. Charles Place
            case 3:
                return 24; // Illinois Avenue
            case 4:
                return 39; // Boardwalk
            case 5:
                return 5; // Reading Railroad
            case 6:
            case 7:
                return Board.getNearestRailroad(currentPosition);
            case 8:
                return Board.getNearestUtility(currentPosition);
            case 9:
                return (currentPosition - 3 + Board.BOARD_SIZE) % Board.BOARD_SIZE;
            default:
                return currentPosition; // non-movement cards ignored
        }
    }

    public int drawCommunityChestCard(int currentPosition) {
        int card = random.nextInt(16);

        switch (card) {
            case 0:
                return Board.GO;
            case 1:
                return Board.JAIL;
            default:
                return currentPosition; // non-movement cards ignored
        }
    }
}
