class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingSystem {

    public static void main(String[] args) {

        HotelBooking h1 = new HotelBooking();

        HotelBooking h2 =
                new HotelBooking("Mahak", "Deluxe", 3);

        HotelBooking h3 = new HotelBooking(h2);

        h1.display();

        System.out.println();

        h2.display();

        System.out.println();

        h3.display();
    }
}