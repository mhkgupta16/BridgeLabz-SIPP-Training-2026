public class MovieSeatReservation {

    static int[] seats = {101, 102, 103, 104, 105};

    static int getSeat(int index) {

        try {

            return seats[index];

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid seat position!");

            return -1;
        }
    }

    public static void main(String[] args) {

        int seat = getSeat(8);

        System.out.println("Seat Number = " + seat);
    }
}