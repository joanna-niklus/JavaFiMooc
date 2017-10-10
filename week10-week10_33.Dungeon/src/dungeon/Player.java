package dungeon;

public class Player {
    private Location location;

    public Player(int length, int height) {
        this.location = new Location(0,0);
        location.setBoundaries(length, height);
    }

    public Location location() {
        return location;
    }

    public void move(char direction) {
        location.makeMove(direction);
    }

    @Override
    public String toString() {
        return "@ " + this.location;
    }
}
