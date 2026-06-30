import java.util.ArrayList;
import java.util.List;

class EmployeeRecord {
  int id;
  String name;
}

class Person extends EmployeeRecord {
  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "id= " + id + " name= " + name;
  }
}

public class Employee {
  public static void main(String[] args) {
    List<Person> list = new ArrayList<>();
    list.add(new Person(1, "mahak"));
    for (Person e : list) {
      // System.out.println(e.id+" " + e.name);
      System.out.println(e);

    }
  }
}
