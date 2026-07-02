package Assignment;
class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First  : " + first);
        System.out.println("Second : " + second);
    }
}

public class PairDemo {

    public static void main(String[] args) {

        Pair<String, Integer> p1 =
                new Pair<>("Mahak", 101);

        Pair<String, Double> p2 =
                new Pair<>("Maths", 95.5);

        p1.display();

        System.out.println();

        p2.display();
    }
}