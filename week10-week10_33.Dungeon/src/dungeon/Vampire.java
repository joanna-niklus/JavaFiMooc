package dungeon;

import java.util.Random;

public class Vampire {
    private final char[] POSSIBILITIES = {'w', 'a', 's', 'd'};
    private Location location;

    public Vampire(int length, int height) {
        this.location = new Location(new Random().nextInt(length), new Random().nextInt(height));
        location.setBoundaries(length, height);
    }

    public Location move() {
        this.location.makeMove(makeDecision());
        return this.location;
    }

    public Location location() {
        return location;
    }

    private char makeDecision() {
        return POSSIBILITIES[new Random().nextInt(4)];
    }

    @Override
    public String toString() {
        return "v " + this.location;
    }

    public void stepBack(Location previousLoc) {
        this.location = previousLoc;
    }
}
