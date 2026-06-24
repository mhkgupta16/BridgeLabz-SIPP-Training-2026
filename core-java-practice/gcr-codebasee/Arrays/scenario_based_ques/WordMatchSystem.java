






/*3. Word Match System
A recruitment portal receives two skill keywords from a candidate.
Write a program that:
Accepts two strings.
Checks whether they are anagrams.
Displays both strings in uppercase.
Shows the total length of each string.
Prints a suitable message based on the result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {
    
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first skill keyword: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second skill keyword: ");
        String str2 = sc.nextLine();

        // Display uppercase strings
        System.out.println("\nFirst String (Uppercase): " + str1.toUpperCase());
        System.out.println("Second String (Uppercase): " + str2.toUpperCase());

        // Display lengths
        System.out.println("Length of First String: " + str1.length());
        System.out.println("Length of Second String: " + str2.length());

        // Check anagram
        if (isAnagram(str1, str2)) {
            System.out.println("Result: Both skill keywords are ANAGRAMS.");
        } else {
            System.out.println("Result: Both skill keywords are NOT ANAGRAMS.");
        }

        sc.close();
    }
}