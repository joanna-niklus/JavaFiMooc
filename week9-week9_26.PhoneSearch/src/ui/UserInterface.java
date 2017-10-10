package ui;
 
import logic.Functioning;
 
import java.util.Scanner;
 
public class UserInterface {
    private Scanner scanner;
 
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
 
    public void start() {
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        Boolean working = true;
        Functioning functioning = new Functioning(scanner);
        while (working) {
            System.out.print("\ncommand: ");
            String command = scanner.nextLine();
            switch (command) {
                case "x":
                    working = false;
                    break;
                case "1":
                    functioning.addNumber();
                    break;
                case "2":
                    functioning.searchForNumber();
                    break;
                case "3":
                    functioning.searchForPerson();
                    break;
                case "4":
                    functioning.addAddress();
                    break;
                case "5":
                    functioning.searchPersonalInfo();
                    break;
                case "6":
                    functioning.deleteInfo();
                    break;
                case "7":
                    functioning.containsKeyword(); // does not have alphabetic ordering!
                    break;
            }
        }
    }
}