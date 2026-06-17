public class EmployeeBonusCalculator {

    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {

            data[i][0] = (int)(Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int)(Math.random() * 10) + 1;        // Years
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displayReport(
            double[][] oldData,
            double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println(
                "OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {

            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f%n",
                    oldData[i][0],
                    oldData[i][1],
                    newData[i][1],
                    newData[i][0]);

            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
        System.out.println("Total Bonus = " + totalBonus);
    }

    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData(10);

        double[][] updatedData =
                calculateBonus(employeeData);

        displayReport(employeeData, updatedData);
    }
}