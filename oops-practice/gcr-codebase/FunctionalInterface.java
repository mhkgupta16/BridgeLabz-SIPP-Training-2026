@java.lang.FunctionalInterface
interface Calculate {
  int add(int a, int b);
}

class Addition implements Calculate {
  public int add(int a, int b) {
    return a + b;
  }
}

public class FunctionalInterface {
  public static void main(String[] args) {

    Calculate c = new Addition();

    System.out.println(c.add(10, 20));
  }
}

// using lambda
@java.lang.FunctionalInterface
interface Calculator {

  int add(int a, int b);
}

class Main {
  public static void main(String[] args) {

    Calculator c = (a, b) -> a + b;

    System.out.println(c.add(10, 20));
  }
}

