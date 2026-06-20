
/*1. Username Validator 
A company wants to validate usernames entered by users.
Write a program that:
Accepts a username.
Checks whether it contains any spaces.
Counts the total number of characters.
Converts the username to uppercase.
Displays whether the username is a palindrome.
 */

import java.util.*;
public class UsernameValidator{

  
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String username=sc.next();
  boolean containSpace=username.contains(" ");
  int length=username.length();
 String upperCase=username.toUpperCase();

// Check for palindrome other method
String rev="";
for(int i =length-1;i>=0;i--){
  rev+=username.charAt(i);
}
  boolean isPalindrome=username.equals(rev);
  System.out.println(username);
  System.out.println(containSpace);
  System.out.println(length);
  System.out.println(upperCase);
  System.out.println(isPalindrome);

    
  


 }

  
}