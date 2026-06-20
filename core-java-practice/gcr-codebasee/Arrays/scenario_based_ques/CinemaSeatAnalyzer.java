/*
3. Cinema Seat Analyzer
A cinema hall stores seat bookings in an array.
0 = Empty
1 = Booked
Write a program that:
Finds the longest continuous block of available seats.
Displays the starting and ending position of that block.
Calculates total booked and available seats.
Suggests whether a group of 5 people can sit together.
*/

import java.util.*;
public class CinemaSeatAnalyzer{
   static void analyzeSeats(int seats[]) {

        int booked = 0;
        int available = 0;

        int maxLength = 0;
        int start = -1;
        int end = -1;

        int currentLength = 0;
        int currentStart = 0;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1)
                booked++;
            else
                available++;

            if (seats[i] == 0) {

                if (currentLength == 0)
                    currentStart = i;

                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    end = i;
                }

            } else {
                currentLength = 0;
            }
        }

        System.out.println("Booked Seats = " + booked);
        System.out.println("Available Seats = " + available);

        System.out.println("Longest Empty Block:");
        System.out.println("Start Position = " + start);
        System.out.println("End Position = " + end);

        if (maxLength >= 5)
            System.out.println("Yes, 5 people can sit together.");
        else
            System.out.println("No, 5 people cannot sit together.");
    }















 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int seats[] = new int[n];

        System.out.println("Enter seat status (0=Empty, 1=Booked):");

        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        analyzeSeats(seats);
    }




}