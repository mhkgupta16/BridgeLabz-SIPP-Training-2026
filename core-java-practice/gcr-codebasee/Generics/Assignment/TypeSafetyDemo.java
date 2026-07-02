package Assignment;
import java.util.*;

public class TypeSafetyDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Mahak");
        names.add("Riya");
        names.add("Ankit");

        for (String name : names) {
            System.out.println(name);
        }

        // names.add(100);   // Compile-time Error
    }
}
