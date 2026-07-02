package Assignment;

import java.util.*;

class Repository<T> {

  ArrayList<T> list = new ArrayList<>();

  void add(T item) {
    list.add(item);
  }

  void display() {

    for (T item : list) {
      System.out.println(item);
    }
  }
}

class Student {

  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return id + " " + name;
  }
}

public class GenericRepositoryDemo {

  public static void main(String[] args) {

    Repository<Student> students = new Repository<>();

    students.add(new Student(101, "Mahak"));
    students.add(new Student(102, "Riya"));

    students.display();

    System.out.println();

    Repository<String> cities = new Repository<>();

    cities.add("Delhi");
    cities.add("Agra");
    cities.add("Lucknow");

    cities.display();
  }
}