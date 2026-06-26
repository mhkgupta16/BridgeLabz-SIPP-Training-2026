class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber,
            String ownerName,
            String vehicleType) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {

        System.out.println(vehicleNumber
                + " | "
                + ownerName
                + " | "
                + vehicleType);
    }
}

public class SmartParkingManagement {

    static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars:");

        for (Vehicle v : vehicles) {

            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes:");

        for (Vehicle v : vehicles) {

            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("UP81A1", "Mahak", "Car"),
                new Vehicle("UP81A2", "Riya", "Bike"),
                new Vehicle("UP81A3", "Aman", "Car"),
                new Vehicle("UP81A4", "Priya", "Bike"),
                new Vehicle("UP81A5", "Rohit", "Car"),
                new Vehicle("UP81A6", "Simran", "Bike"),
                new Vehicle("UP81A7", "Karan", "Car"),
                new Vehicle("UP81A8", "Neha", "Bike"),
                new Vehicle("UP81A9", "Ankit", "Car"),
                new Vehicle("UP81A10", "Pooja", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}