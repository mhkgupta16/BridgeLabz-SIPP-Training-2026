/*A kingdom's tax system charges 5% for income <10k,15% for 10k-50k,30% above 50k. read a citizens income,print tax bracket and amount. extend:loop over an array of 10 citizens and tally total tax collected. */

import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tax calculation for one citizen
        System.out.print("Enter citizen income: ");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket = "";

        if (income < 10000) {
            tax = income * 0.05;
            bracket = "5% Tax Bracket";
        } else if (income <= 50000) {
            tax = income * 0.15;
            bracket = "15% Tax Bracket";
        } else {
            tax = income * 0.30;
            bracket = "30% Tax Bracket";
        }

        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        // Extended version for 10 citizens
        double[] incomes = new double[10];
        double totalTax = 0;

        System.out.println("\nEnter incomes of 10 citizens:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\nTax Details:");

        for (int i = 0; i < 10; i++) {
            double citizenTax;

            if (incomes[i] < 10000) {
                citizenTax = incomes[i] * 0.05;
            } else if (incomes[i] <= 50000) {
                citizenTax = incomes[i] * 0.15;
            } else {
                citizenTax = incomes[i] * 0.30;
            }

            totalTax += citizenTax;

            System.out.println("Citizen " + (i + 1) +
                    " Income: " + incomes[i] +
                    " Tax: " + citizenTax);
        }

        System.out.println("\nTotal Tax Collected = " + totalTax);

        sc.close();
    }
}