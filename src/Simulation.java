public class Simulation {

    private int totalTurns;
    private Player player;
    private Dice dice;
    private CardDeck cardDeck;
    private int[] landingCounts;

    public Simulation(int totalTurns) {
        this.totalTurns = totalTurns;
        this.player = new Player();
        this.dice = new Dice();
        this.cardDeck = new CardDeck();
        this.landingCounts = new int[40];
    }

    public void run() {
        for (int i = 0; i < totalTurns; i++) {
            takeTurn();
        }
    }

    private void takeTurn() {

        int doublesCount = 0;

        if (player.isInJail()) {
            handleJailTurn();
            resolveBoardSpace();
            landingCounts[player.getPosition()]++;
            return;
        }

        do {
            int roll = dice.roll();

            if (dice.isDouble()) {
                doublesCount++;
            } else {
                doublesCount = 0;
            }

            if (doublesCount == 3) {
                player.sendToJail();
                landingCounts[player.getPosition()]++;
                return;
            }

            player.move(roll);
            resolveBoardSpace();

            if (player.isInJail()) {
                landingCounts[player.getPosition()]++;
                return;
            }

        } while (dice.isDouble());

        landingCounts[player.getPosition()]++;
    }

    private void handleJailTurn() {

        int roll = dice.roll();

        if (dice.isDouble()) {
            player.releaseFromJail();
            player.move(roll);
        } else {
            player.incrementJailTurn();

            if (player.getJailTurns() >= 3) {
                player.releaseFromJail();
                player.move(roll);
            }
        }
    }

    private void resolveBoardSpace() {
        int position = player.getPosition();

        if (position == Board.GO_TO_JAIL) {
            player.sendToJail();
            return;
        }

        if (Board.isChance(position)) {
            int newPosition = cardDeck.drawChanceCard(position);
            player.setPosition(newPosition);

            if (newPosition == Board.JAIL) {
                player.sendToJail();
                return;
            }

            if (Board.isCommunityChest(newPosition)) {
                resolveBoardSpace();
            }
        }

        if (Board.isCommunityChest(player.getPosition())) {
            int newPosition = cardDeck.drawCommunityChestCard(player.getPosition());
            player.setPosition(newPosition);

            if (newPosition == Board.JAIL) {
                player.sendToJail();
            }
        }
    }

   public void printResults() {
    System.out.println("Landing Frequencies:");
    for (int i = 0; i < landingCounts.length; i++) {
        double percentage = (landingCounts[i] * 100.0) / totalTurns;
        System.out.printf(
            "%2d - %-25s : %5d landings (%.2f%%)%n",
            i,
            Board.getSpaceName(i),
            landingCounts[i],
            percentage
        );
    }
}
