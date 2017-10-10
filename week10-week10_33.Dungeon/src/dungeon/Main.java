package dungeon;


public class Main {
    public static void main(String[] args) {
        new Dungeon(5,5,5,14,true).run(); // length, height, vampires, moves, vampiresMove
    }
    // the game is to destroy all the vampires
    // moves are made by wasd keys
    // one loses the game when lamp charges reach 0
    // and there are vampires remaining on the map.
    
    // one bug remains: a vampire clashes with another vampire
    // and that line is extended by one "."
    // since it happens only sometimes,
    // I have moved on to the next exercises,
    // however I plan on fixing this issue
    // in the near future.
}
