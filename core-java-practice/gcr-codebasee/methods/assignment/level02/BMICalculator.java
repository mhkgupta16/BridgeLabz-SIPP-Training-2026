import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;
        return weight / (heightMeter * heightMeter);
    }

    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = calculateBMI(
                    personData[i][0],
                    personData[i][1]
            );
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    getBMIStatus(personData[i][2]));
        }
    }
}