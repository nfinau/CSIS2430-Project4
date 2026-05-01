public class Player {

    private int position;

    public Player() {
        this.position = 0;
    }

    public void move(int spaces) {
        position = (position + spaces) % 40;
    }

    public int getPosition() {
        return position;
    }
}
