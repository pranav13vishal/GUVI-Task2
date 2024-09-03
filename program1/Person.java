package Task2.program1;
class Person {
    private String name;
    private int age;

    // default constructor - to set the default age to 18
    public Person() {
        this.age = 18;
    }

    // parameterized constructor - to set name and age directly
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to set name
    public void setName(String name) {
        this.name = name;
    }

    // displaying the person name and age
    public void display() {
        System.out.println("NAME : " + name);
        System.out.println("AGE :" + age);

    }
}




