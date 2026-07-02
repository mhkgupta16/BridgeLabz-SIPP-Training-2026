package Assignment;

class Student {

  String name;

  <T> Student(T value) {
    name = value.toString();
  }

  void display() {
    System.out.println(name);
  }
}

public class GenericConstructorDemo {

  public static void main(String[] args) {

    Student s1 = new Student("Mahak");
    Student s2 = new Student(101);
    Student s3 = new Student(95.5);

    s1.display();
    s2.display();
    s3.display();
  }
}