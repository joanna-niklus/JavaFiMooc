import ui.UserInterface;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        // These input strings are for quicker testing of functions.
//        String input = "1\n" + "pekka\n" + "040-123456\n" +
//                "2\n" + "jukka\n" +
//                "2\n" + "pekka\n" +
//                "1\n" + "pekka\n" + "09-222333\n" +
//                "2\n" + "pekka\n" +
//                "3\n" + "02-444123\n" +
//                "3\n" + "09-222333\n" +
//                "5\n" + "pekka\n" +
//                "4\n" + "pekka\n" + "ida ekmanintie\n" + "helsinki\n" +
//                "5\n" + "pekka\n" +
//                "4\n" + "jukka\n" + "korsontie\n" + "vantaa\n" +
//                "5\n" + "jukka\n" +
//                "6\n" + "jukka\n" +
//                "5\n" + "jukka\n" +
//                "x\n";
//        String input = "1\n" + "anna\n" + "342390842\n" +
//                "1\n" + "anna\n" + "43279847\n" +
//                "2\n" + "anna\n" +
//                "3\n" + "342390842\n" +
//                "5\n" + "anna\n" +
//                "1\n" + "bella\n" + "23456789\n" +
//                "1\n" + "ann\n" + "12345678\n" +
//                "1\n" + "xander\n" + "1234567\n" +
//                "1\n" + "bob\n" + "1234567\n" +
//                "7\n" + "\n" +
//                "x\n";
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
}
