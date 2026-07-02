package Assignment;

class GenericMethodDemo {

  static <T> void print(T value) {
    System.out.println(value);
  }

  public static void main(String[] args) {

    print(100);

    print("Mahak");

    print(95.5);

    print(true);
  }
}