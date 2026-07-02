package Assignment;

class FindMaxDemo {

  static <T extends Comparable<T>> T findMax(T[] arr) {

    T max = arr[0];

    for (int i = 1; i < arr.length; i++) {

      if (arr[i].compareTo(max) > 0) {
        max = arr[i];
      }
    }

    return max;
  }

  public static void main(String[] args) {

    Integer[] a = { 10, 40, 20, 80, 30 };

    String[] s = { "Apple", "Mango", "Banana" };

    System.out.println(findMax(a));

    System.out.println(findMax(s));
  }
}