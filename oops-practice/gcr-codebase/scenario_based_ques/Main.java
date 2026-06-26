class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    private int stationId;
    private double unitsConsumed;

    ChargingStation(int stationId, double unitsConsumed) {

        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;

        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {

        System.out.println("\nStation ID: " + stationId);
        System.out.println("Units Consumed: "
                + unitsConsumed);

        System.out.println("Bill: ₹"
                + calculateBill());
    }
}

public class Main {

    public static void main(String[] args) {

        ChargingStation[] stations = {
                new ChargingStation(1, 120),
                new ChargingStation(2, 150),
                new ChargingStation(3, 200),
                new ChargingStation(4, 180),
                new ChargingStation(5, 90)
        };

        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }

        System.out.println("\nTotal Stations: "
                + ChargingStation.totalStations);

        ChargingStation.electricityRate = 10;

        System.out.println("\nUpdated Electricity Rate = ₹10");

        for (ChargingStation s : stations) {
            System.out.println("New Bill: ₹"
                    + s.calculateBill());
        }
    }
}