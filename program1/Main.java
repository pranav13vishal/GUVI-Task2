package Task2.program1;

public class Main {

    public static void main(String[] args) {

        // creating an instance of a class Person
        Person p1 = new Person();      // invokes default constructor
        p1.setName("Dhoni");
        p1.display();

        Person p2 = new Person("Pranav", 20);   // invokes parameterized constructor
        p2.display();
    }
}

