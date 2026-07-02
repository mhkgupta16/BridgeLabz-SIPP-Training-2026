package Assignment;
class Box<T> {

    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class SimpleGenericsDemo {

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Mahak");

        b1.display();
        b2.display();
    }
}