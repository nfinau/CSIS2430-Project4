public class Board {

    public static final int BOARD_SIZE = 40;

    public static final int GO = 0;
    public static final int JAIL = 10;
    public static final int GO_TO_JAIL = 30;

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
