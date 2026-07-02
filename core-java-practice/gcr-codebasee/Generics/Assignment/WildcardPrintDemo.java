package Assignment;
import java.util.*;

public class WildcardPrintDemo {

    static void printList(List<?> list) {

        for (Object x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(10, 20, 30);

        List<String> names =
                Arrays.asList("Mahak", "Riya", "Ankit");

        List<Double> marks =
                Arrays.asList(95.5, 88.0, 91.2);

        printList(nums);

        System.out.println();

        printList(names);

        System.out.println();

        printList(marks);
    }
}