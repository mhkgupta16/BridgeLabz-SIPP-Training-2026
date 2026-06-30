import java.util.*;

public class SmartParkingSlotManager {

    ArrayList<String> vehicles = new ArrayList<>();

    void enterVehicle(String number) {

        vehicles.add(number);

        System.out.println(number + " entered the parking area.");
    }

    void exitVehicle(String number) {

        if (vehicles.remove(number)) {
            System.out.println(number + " exited successfully.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    void searchVehicle(String number) {

        if (vehicles.contains(number)) {
            System.out.println(number + " is currently parked.");
        } else {
            System.out.println(number + " is not in the parking area.");
        }
    }

    void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Total Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        SmartParkingSlotManager manager =
                new SmartParkingSlotManager();

        manager.enterVehicle("UP32AB1234");
        manager.enterVehicle("DL01XY5678");
        manager.enterVehicle("HR26CD9012");

        manager.searchVehicle("DL01XY5678");

        manager.exitVehicle("UP32AB1234");

        manager.displayVehicles();
    }
}
