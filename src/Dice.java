import java.util.Random;

public class Dice {

    private Random random;
    private int die1;
    private int die2;

    public Dice() {
        random = new Random();
    }

    public int roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }

    public boolean isDouble() {
        return die1 == die2;
    }
}
