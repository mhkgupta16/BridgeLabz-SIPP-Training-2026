package Assignment;
import java.util.*;

public class RawTypeVsGenericDemo {

    public static void main(String[] args) {

        // Raw Type (Not Recommended)
        List list = new ArrayList();

        list.add("Mahak");
        list.add(100);
        list.add(true);

        System.out.println("Raw List: " + list);

        System.out.println();

        // Generic Type (Recommended)
        List<String> names = new ArrayList<>();

        names.add("Mahak");
        names.add("Riya");
        names.add("Ankit");

        System.out.println("Generic List: " + names);
    }
}