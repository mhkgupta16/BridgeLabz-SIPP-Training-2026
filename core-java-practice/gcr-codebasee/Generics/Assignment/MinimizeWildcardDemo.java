package Assignment;

import java.util.*;

public class MinimizeWildcardDemo {

  static void print(List<String> list) {

    for (String s : list) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();

    names.add("Mahak");
    names.add("Riya");
    names.add("Ankit");

    print(names);
  }
}