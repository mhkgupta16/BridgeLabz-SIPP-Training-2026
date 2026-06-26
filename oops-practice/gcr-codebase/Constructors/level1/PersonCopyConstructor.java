class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class PersonCopyConstructor {

    public static void main(String[] args) {

        Person p1 = new Person("Mahak", 20);

        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}