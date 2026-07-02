package Assignment;

interface Storage<T> {

    void add(T item);

    T get();
}

class NumberStorage implements Storage<Integer> {

    int num;

    public void add(Integer item) {
        num = item;
    }

    public Integer get() {
        return num;
    }
}

public class GenericInterfaceDemo {

    public static void main(String[] args) {

        NumberStorage n = new NumberStorage();

        n.add(100);

        System.out.println(n.get());
    }
}