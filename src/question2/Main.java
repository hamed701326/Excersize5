package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        insertPerson(people);
    }
    public static void insertPerson(List<Person> people){
        Person person=new Person();
        System.out.println("Enter Specification for this person:");
        System.out.println("firstName: ");person.setFirstName(scanner.next());
        System.out.print("lastName: ");person.setLastName(scanner.next());
        System.out.print("Age: ");person.setAge(scanner.nextInt());
        System.out.println("Address[Enter this way: city-zone-street-alley-postCode]:");
        String input=scanner.next();
        String [] address=input.split("-");
        person.setAddress(new Address(address[0],address[1],address[2],address[3],Long.parseLong(address[4])));
        people.add(person);

    }
}
