public class Board {

    public static final int BOARD_SIZE = 40;

    public static final int GO = 0;
    public static final int JAIL = 10;
    public static final int GO_TO_JAIL = 30;

    private static final String[] SPACE_NAMES = {
        "GO",
        "Mediterranean Avenue",
        "Community Chest",
        "Baltic Avenue",
        "Income Tax",
        "Reading Railroad",
        "Oriental Avenue",
        "Chance",
        "Vermont Avenue",
        "Connecticut Avenue",
        "Jail / Just Visiting",
        "St. Charles Place",
        "Electric Company",
        "States Avenue",
        "Virginia Avenue",
        "Pennsylvania Railroad",
        "St. James Place",
        "Community Chest",
        "Tennessee Avenue",
        "New York Avenue",
        "Free Parking",
        "Kentucky Avenue",
        "Chance",
        "Indiana Avenue",
        "Illinois Avenue",
        "B&O Railroad",
        "Atlantic Avenue",
        "Ventnor Avenue",
        "Water Works",
        "Marvin Gardens",
        "Go To Jail",
        "Pacific Avenue",
        "North Carolina Avenue",
        "Community Chest",
        "Pennsylvania Avenue",
        "Short Line Railroad",
        "Chance",
        "Park Place",
        "Luxury Tax",
        "Boardwalk"
    };

    public static String getSpaceName(int position) {
        return SPACE_NAMES[position];
    }

    public static boolean isChance(int position) {
        return position == 7 || position == 22 || position == 36;
    }

    public static boolean isCommunityChest(int position) {
        return position == 2 || position == 17 || position == 33;
    }

    public static int getNearestRailroad(int position) {
        if (position < 5 || position >= 35) {
            return 5;
        } else if (position < 15) {
            return 15;
        } else if (position < 25) {
            return 25;
        } else {
            return 35;
        }
    }

    public static int getNearestUtility(int position) {
        if (position < 12 || position >= 28) {
            return 12;
        } else {
            return 28;
        }
    }
}
