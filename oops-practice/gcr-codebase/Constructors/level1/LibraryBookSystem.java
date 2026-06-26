class Book {

    String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author,
         double price, boolean available) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {

        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + available);
    }
}

public class LibraryBookSystem {

    public static void main(String[] args) {

        Book b1 =
                new Book("Atomic Habits",
                        "James Clear",
                        500,
                        true);

        b1.display();

        System.out.println();

        b1.borrowBook();

        System.out.println();

        b1.display();
    }
}