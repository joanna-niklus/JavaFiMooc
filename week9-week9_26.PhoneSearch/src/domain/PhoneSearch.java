package domain;
 
import java.util.*;
 
public class PhoneSearch {
    private Map<String, Person> byNames;
    private Map<String, Person> byNumbers;
 
    public PhoneSearch() {
        this.byNames = new HashMap<>();
        this.byNumbers = new HashMap<>();
    }
 
    public void addNumber(String name, String number) {
        if (byNames.containsKey(name)) {
            byNames.get(name).addNumber(number);
            byNumbers.put(number, new Person(name, number));
        } else {
            Person person = new Person(name, number);
            byNames.put(name, person);
            byNumbers.put(number, person);
        }
    }
 
    public void searchForNumber(String name) {
        if (byNames.containsKey(name)) {
            byNames.get(name).printOnlyNumbers(" ");
        } else {
            System.out.println(" not found");
        }
    }
 
    public void searchForPerson(String number) {
        if (byNumbers.containsKey(number)) {
            System.out.println(" " + byNumbers.get(number).name());
        } else {
            System.out.println(" not found");
        }
    }
 
    public void addAddress(String name, String address) {
        if (byNames.containsKey(name)) {
            byNames.get(name).setAddress(address);
        } else {
            byNames.put(name, new Person(name, "", address));
        }
    }
 
    public void searchForInfo(String name) {
        if (byNames.containsKey(name)) {
            byNames.get(name).printInfoWithoutName();
        } else {
            System.out.println("  not found");
        }
    }
 
    public void delete(String name) {
        if (byNames.containsKey(name) || byNumbersContains(name)) {
            for (String number : byNames.get(name).getNumbers()) {
                byNumbers.remove(number);
            }
            byNames.remove(name);
        }
    }
 
    private boolean byNumbersContains(String name) {
        for (Person person : byNumbers.values()) {
            if (person.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
 
    public void containsKeyword(String keyword) {
        Map<String, Person> persons = new HashMap<>();
        for (Person person : byNames.values()) {
            if (person.anyContains(keyword) && !keyword.isEmpty()) {
                persons.put(person.name(), person);
            } else if (keyword.isEmpty()) {
                persons.put(person.name(), person);
            }
        }
        ArrayList<String> ordered = new ArrayList<>();
        ordered.addAll(persons.keySet());
        Collections.sort(ordered);
        for (String name : ordered) {
            byNames.get(name).printInfoWithName();
        }
        if (ordered.isEmpty()) {
            System.out.println(" keyword not found");
        }
    }
 
}