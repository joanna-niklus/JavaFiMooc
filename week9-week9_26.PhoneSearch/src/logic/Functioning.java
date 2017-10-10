package logic;
 
import domain.PhoneSearch;
 
import java.util.Scanner;
 
public class Functioning {
    private Scanner scanner;
    private PhoneSearch phonebook;
 
    public Functioning(Scanner scanner) {
        this.scanner = scanner;
        this.phonebook = new PhoneSearch();
    }
 
    public void addNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String number = scanner.nextLine();
        phonebook.addNumber(name, number);
    }
 
    public void searchForNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        phonebook.searchForNumber(name);
    }
 
    public void searchForPerson() {
        System.out.print("number: ");
        String number = scanner.nextLine();
        phonebook.searchForPerson(number);
    }
 
    public void addAddress() {
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();
        phonebook.addAddress(name, street + " " + city);
    }
 
    public void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phonebook.searchForInfo(name);
    }
 
    public void deleteInfo() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phonebook.delete(name);
    }
 
    public void containsKeyword() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = scanner.nextLine();
        phonebook.containsKeyword(keyword);
    }
}