package Assignment;

class Engine {

  void start() {
    System.out.println("Engine Started");
  }
}

class Car {

  Engine engine;

  Car() {
    engine = new Engine();
  }

  void drive() {
    engine.start();
    System.out.println("Car is moving");
  }
}

public class CompositionOverInheritanceDemo {

  public static void main(String[] args) {

    Car c = new Car();

    c.drive();
  }
}