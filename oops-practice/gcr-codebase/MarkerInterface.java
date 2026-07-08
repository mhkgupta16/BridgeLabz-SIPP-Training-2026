interface Printable {
}

class Document implements Printable {

    void print() {
        System.out.println("Printing document...");
    }
}

public class MarkerInterface {
    public static void main(String[] args) {

        Document d = new Document();

        if (d instanceof Printable) {
            d.print();
        }
    }
}
