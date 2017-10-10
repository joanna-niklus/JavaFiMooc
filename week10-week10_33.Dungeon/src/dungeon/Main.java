package dungeon;


public class Main {
    public static void main(String[] args) {
        new Dungeon(5,5,5,14,true).run();
    }
//CURRENT PROBLEM:
//Tested Dungeon dungeon = new Dungeon(5,5,3,3,false); dungeon.run();
//Dungeon line has wrong length. Incorrect line is:
//            ...vv.
//    Your whole print output was:
//    3
//
//    @ 0 0
//    v 3 4
//    v 3 4
//    v 4 3
//
//    @....
//    .....
//    .....
//    ....v
//    ...vv.
}
