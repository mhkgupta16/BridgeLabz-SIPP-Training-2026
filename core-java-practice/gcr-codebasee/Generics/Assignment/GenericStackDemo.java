package Assignment;

import java.util.*;

class Stack<T> {

  ArrayList<T> list = new ArrayList<>();

  void push(T item) {
    list.add(item);
  }

  T pop() {

    if (list.isEmpty()) {
      return null;
    }

    return list.remove(list.size() - 1);
  }

  void display() {

    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }
  }
}

public class GenericStackDemo {

  public static void main(String[] args) {

    Stack<Integer> s = new Stack<>();

    s.push(10);
    s.push(20);
    s.push(30);

    s.display();

    System.out.println("Popped: " + s.pop());

    s.display();
  }
}