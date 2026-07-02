package Assignment;
import java.util.*;

public class TypeErasureDemo {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());

        System.out.println(
            list1.getClass() == list2.getClass()
        );
    }
}