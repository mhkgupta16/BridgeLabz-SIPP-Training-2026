
/* 3.  Election Booth Manager 🗳
Design a polling booth system.
●              Take age input.
●              Use if to check if eligible (>=18).
●              Record vote (1, 2, or 3 for candidates).
●              Loop for multiple voters, exit on special code.
 */

import java.util.Scanner;

public class ElectionBoothManager {

  public static void displayResult(int c1, int c2, int c3) {

    System.out.println("\nVoting Summary");
    System.out.println("Candidate 1 Votes: " + c1);
    System.out.println("Candidate 2 Votes: " + c2);
    System.out.println("Candidate 3 Votes: " + c3);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int candidate1 = 0;
    int candidate2 = 0;
    int candidate3 = 0;

    System.out.println("Enter voter age (or -1 to finish):");
    while (true) {
      int age = sc.nextInt();
      System.out.println("Age entered: " + age);

      if (age == -1) {
        break;
      }

      if (age >= 18) {

        System.out.println("Eligible to Vote");
        System.out.println("1. Candidate 1");
        System.out.println("2. Candidate 2");
        System.out.println("3. Candidate 3");

        System.out.print("Enter Vote: ");
        int vote = sc.nextInt();

        if (vote == 1) {
          candidate1++;
        } else if (vote == 2) {
          candidate2++;
        } else if (vote == 3) {
          candidate3++;
        } else {
          System.out.println("Invalid Vote");
        }

      } else {
        System.out.println("Not Eligible to Vote");
      }
    }

    displayResult(candidate1, candidate2, candidate3);

    sc.close();
  }
}