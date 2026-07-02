package Assignment;

import java.util.*;

public class LowerBoundWildcardDemo {

  static void addNumbers(List<? super Integer> list) {

    list.add(10);
    list.add(20);
    list.add(30);
  }

  public static void main(String[] args) {

    List<Integer> a = new ArrayList<>();
    List<Number> b = new ArrayList<>();
    List<Object> c = new ArrayList<>();

    addNumbers(a);
    addNumbers(b);
    addNumbers(c);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}