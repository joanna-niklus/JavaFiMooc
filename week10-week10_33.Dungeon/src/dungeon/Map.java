package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int length;
    private int height;
    private Player player;
    private List<Vampire> vampires;
    private boolean vampMoving;

    public Map(int length, int height, Player player, int vampires) {
        this.length = length;
        this.height = height;
        this.vampires = new ArrayList<>();
        for (int i = 0; i < vampires; i++) {
            this.vampires.add(new Vampire(length, height));
        }
        this.player = player;
    }

    public int vampiresRemaining() {
        return this.vampires.size();
    }

    public void generateField() {
        System.out.println(player);
        for (Vampire vampire : vampires) {
            System.out.println(vampire);
        }
        System.out.println();
        boolean alreadyMarked = false;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (player.location().equals(new Location(j, i))) {
                    System.out.print("@");
                    alreadyMarked = true;
                }
                for (Vampire vampire : vampires) {
                    if (vampire.location().equals(new Location(j, i))) {
                        System.out.print("v");
                        alreadyMarked = true;
                    }
                }
                if (!alreadyMarked) {
                    System.out.print(".");
                }
                alreadyMarked = false;
            }
            System.out.println();
        }
    }

    public void moveParticipants(String directions) {
        List<Vampire> clashing = new ArrayList<>();
        for (char move : directions.toCharArray()) {
            player.move(move);
            for (Vampire vampire : vampires) {
                if (vampire.location().equals(player.location())) {
                    clashing.add(vampire);
                }
            }
            this.vampires.removeAll(clashing);
        }
        if (vampMoving) {
            int i = 0;
            while (i < directions.length()) {
                for (Vampire vampire : vampires) {
                    Location previousLoc = vampire.location();
                    Location newMove = vampire.move();
                    if (getCurrentLocations().contains(newMove)) {
                        vampire.stepBack(previousLoc);
                    }
                }
                i++;
            }
        }
    }

    private List<Location> getCurrentLocations() {
        List<Location> moves = new ArrayList<>();
        moves.add(player.location());
        for (Vampire vampire : vampires) {
            moves.add(vampire.location());
        }
        return moves;
    }

    public void setVampMoving(boolean vampMoving) {
        this.vampMoving = vampMoving;
    }
}
