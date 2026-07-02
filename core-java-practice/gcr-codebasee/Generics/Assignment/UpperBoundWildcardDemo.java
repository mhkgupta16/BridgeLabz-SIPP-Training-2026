package Assignment;
import java.util.*;

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat Meowing");
    }
}

public class UpperBoundWildcardDemo {

    static void display(List<? extends Animal> list) {

        for (Animal a : list) {
            a.sound();
        }
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat());
        cats.add(new Cat());

        display(dogs);

        System.out.println();

        display(cats);
    }
}