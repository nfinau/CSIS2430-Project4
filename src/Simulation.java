import java.util.Arrays;

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
        int roll = dice.roll();
        player.move(roll);

        int position = player.getPosition();
        landingCounts[position]++;
    }

    public void printResults() {
        System.out.println("Landing Frequencies:");
        for (int i = 0; i < landingCounts.length; i++) {
            System.out.println("Space " + i + ": " + landingCounts[i]);
        }
    }
}
