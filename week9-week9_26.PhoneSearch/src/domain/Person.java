package domain;
 
import java.util.HashSet;
import java.util.Set;
 
public class Person {
    private String name;
    private Set<String> numbers;
    private String address;
 
    public Person(String name, String number, String address) {
        this.name = name;
        this.numbers = new HashSet<>();
        if (!number.isEmpty()) {
            numbers.add(number);
        }
        this.address = address;
    }
 
    public Person(String name, String number) {
        this(name, number, "");
    }
 
    public Person(String name) {
        this(name, "", "");
    }
 
    public String name() {
        return name;
    }
 
    public Set<String> getNumbers() {
        return numbers;
    }
 
    public void addNumber(String number) {
        this.numbers.add(number);
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public void printOnlyNumbers(String spaces) {
        if (this.numbers.isEmpty()) {
            System.out.print(" not found\n");
        } else if (spaces.length() == 3){
            System.out.print(":\n");
            for (String number : numbers) {
                System.out.println(spaces + number);
            }
        } else {
            for (String number : numbers) {
                System.out.println(spaces + number);
            }
 
        }
    }
 
    public void printInfoWithName() {
        System.out.println(" " + this.name);
        printInfoWithoutName();
    }
 
    public void printInfoWithoutName() {
        System.out.print("  address");
        if (address.isEmpty()) {
            System.out.print(" unknown\n");
        } else {
            System.out.print(": " + this.address + "\n");
        }
        System.out.print("  phone number");
        printOnlyNumbers("   ");
    }
 
    public boolean anyContains(String keyword) {
        if (this.name.contains(keyword) || this.address.contains(keyword)) {
            return true;
        }
        for (String number : numbers) {
            if (number.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
 
        Person person = (Person) o;
 
        if (!name.equals(person.name)) return false;
        if (numbers != null ? !numbers.equals(person.numbers) : person.numbers != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }
 
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (numbers != null ? numbers.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}