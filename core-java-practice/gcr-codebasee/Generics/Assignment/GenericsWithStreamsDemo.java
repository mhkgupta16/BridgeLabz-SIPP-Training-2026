package Assignment;

import java.util.*;
import java.util.stream.*;

public class GenericsWithStreamsDemo {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65);

    List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

    System.out.println("Original List: " + numbers);

    System.out.println("Even Numbers: " + evenNumbers);
  }
}