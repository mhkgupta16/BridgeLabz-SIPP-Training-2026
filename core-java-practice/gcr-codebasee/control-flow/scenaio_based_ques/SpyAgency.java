/*
A spy agency encodes messages. Reverse a secret message, check if
it is a palindrome, count vowels/consonants, and verify if two
intercepts are anagrams. Extend: find the first non-repeating
character in a surveillance log.
*/
import java.util.*;

public class SpyAgency {

    // Reverse String
    public static String reverseMessage(String message) {
        String rev = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            rev += message.charAt(i);
        }
        return rev;
    }

    // Check Palindrome
    public static boolean isPalindrome(String message) {
        String rev = reverseMessage(message);
        return message.equals(rev);
    }

    // Count Vowels
    public static int countVowels(String message) {
        int vowels = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }
        return vowels;
    }

    // Count Consonants
    public static int countConsonants(String message) {
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    consonants++;
                }
            }
        }
        return consonants;
    }

    // Check Anagram
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // First Non-Repeating Character
    public static char firstNonRepeatingChar(String log) {

        for (int i = 0; i < log.length(); i++) {
           int count=0;
           for(int j=0;j<log.length();j++){
            if(log.charAt(i)==log.charAt(j)){
              count++;
            }
           }
           if(count==1)            return log.charAt(i);
   
            }            return '\0'; 
     


        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Secret Message
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));

        if (isPalindrome(message)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        System.out.println("Vowels: " + countVowels(message));
        System.out.println("Consonants: " + countConsonants(message));

        // Anagram Check
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        // Surveillance Log
        String log = sc.nextLine();

        char result = firstNonRepeatingChar(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
        
    }
}