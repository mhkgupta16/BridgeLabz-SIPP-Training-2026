package Assignment;

class Animal {

  void show() {
    System.out.println("Animal");
  }
}

class Dog extends Animal {

  void bark() {
    System.out.println("Dog Barking");
  }
}

class Box<T extends Animal> {

  T obj;

  Box(T obj) {
    this.obj = obj;
  }

  void display() {
    obj.show();
  }
}

public class BoundedTypeParameterDemo {

  public static void main(String[] args) {

    Box<Dog> b = new Box<>(new Dog());

    b.display();
  }
}