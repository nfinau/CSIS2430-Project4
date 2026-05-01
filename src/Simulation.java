public class Simulation {

    private int totalTurns;
    private Player player;
    private Dice dice;
    private int[] landingCounts;

    public Simulation(int totalTurns) {
        this.totalTurns = totalTurns;
        this.player = new Player();
        this.dice = new Dice();
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

            // Go To Jail square (index 30)
            if (player.getPosition() == 30) {
                player.sendToJail();
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

    public void printResults() {
        System.out.println("Landing Frequencies:");
        for (int i = 0; i < landingCounts.length; i++) {
            System.out.println("Space " + i + ": " + landingCounts[i]);
        }
    }
}
