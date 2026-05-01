public class Player {

    private int position;
    private boolean inJail;
    private int jailTurns;

    public Player() {
        this.position = 0;
        this.inJail = false;
        this.jailTurns = 0;
    }

    public void move(int spaces) {
        position = (position + spaces) % 40;
    }

    public int getPosition() {
        return position;
    }

    public void sendToJail() {
        position = 10; // Jail index
        inJail = true;
        jailTurns = 0;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void incrementJailTurn() {
        jailTurns++;
    }

    public int getJailTurns() {
        return jailTurns;
    }

    public void releaseFromJail() {
        inJail = false;
        jailTurns = 0;
    }
}
