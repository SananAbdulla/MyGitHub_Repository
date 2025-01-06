package day31_customClasses;

class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        this("Unknown", 0); // Calls the second constructor
    }

    // Constructor with one parameter
    public Person(String name) {
        this(name, 0); // Calls the third constructor
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("Bob", 25);

        p1.display(); // Name: Unknown, Age: 0
        p2.display(); // Name: Alice, Age: 0
        p3.display(); // Name: Bob, Age: 25
    }
}
