class MovieTicket {

    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName) {

        this.movieName = movieName;
    }

    void bookTicket(String seatNumber, double price) {

        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Ticket booked successfully.");
    }

    void displayTicket() {

        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {

        MovieTicket ticket =
                new MovieTicket("Avengers: Endgame");

        ticket.bookTicket("A12", 350);

        ticket.displayTicket();
    }
}