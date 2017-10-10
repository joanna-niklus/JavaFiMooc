package dungeon;

import java.util.Scanner;

public class Dungeon {
    private Map map;
    private int moves;
    private Scanner scanner;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.map = new Map(length, height, new Player(length, height), vampires);
        this.moves = moves;
        this.scanner = new Scanner(System.in);
        map.setVampMoving(vampiresMove);
    }

    public void run() {
        while (moves > 0) {
            System.out.println(this.moves + "\n");
            this.moves--;
            map.generateField();
            System.out.println();
            String directions = scanner.nextLine();
            map.moveParticipants(directions);
            if (map.vampiresRemaining() == 0) {
                System.out.println("YOU WIN");
                break;
            }
        }
        if (map.vampiresRemaining() > 0) {
            System.out.println("YOU LOSE");
        }
    }
}
