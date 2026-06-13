/*


3.   Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
●  Use switch-case for the menu.
●  while loop to continue until the parking lot is full or the user exits.

*/


  import java.util.Scanner;

public class ParkingGateSystem {

    public static int parkVehicle(int occupied, int capacity) {

        if (occupied < capacity) {
            occupied++;
            System.out.println("Vehicle Parked Successfully.");
        } else {
            System.out.println("Parking Lot Full.");
        }

        return occupied;
    }

    public static int exitVehicle(int occupied) {

        if (occupied > 0) {
            occupied--;
            System.out.println("Vehicle Exited Successfully.");
        } else {
            System.out.println("Parking Lot Empty.");
        }

        return occupied;
    }

    public static void showOccupancy(int occupied, int capacity) {

        System.out.println("Occupied Slots: " + occupied);
        System.out.println("Available Slots: " + (capacity - occupied));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int capacity = 10;
        int occupied = 0;
        int choice;

        while (occupied < capacity) {

            System.out.println("\n----- Parking Lot Menu -----");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    occupied = parkVehicle(occupied, capacity);
                    break;

                case 2:
                    occupied = exitVehicle(occupied);
                    break;

                case 3:
                    showOccupancy(occupied, capacity);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }

            if (occupied == capacity) {
                System.out.println("Parking Lot is Full!");
                break;
            }
        }

        sc.close();
    }
}