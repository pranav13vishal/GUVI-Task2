package Task2.program4;

public class Person {
    private int age;
    private String name;

    // parametrised constructor
    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    // Function to display name and age in parent class
    public void display() {
        System.out.println("name :" + name);
        System.out.println("age :" + age);
    }

}
// child class employee inherits the properties from parent class person
class Employee extends Person{
    private int employeID;
    private double salary;

    // parametrised constructor
    public Employee(String name, int age, int employeID, double salary) {
        super(name, age);  // sends the name and age to parent class
        this.employeID = employeID;
        this.salary = salary;
    }

    // // Function to display name and age in child class
    public void displayfull() {
        display();
        System.out.println("employeID :" + employeID);
        System.out.println("salary :" + salary);
    }

    public static void main(String[] args) {
        Employee a = new Employee("pranav", 22, 12345, 75000.00);
        a.displayfull();
    }
}
