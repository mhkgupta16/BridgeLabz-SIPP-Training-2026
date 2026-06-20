/*  2. . Secret Message Validator 
A security application receives a secret code.
Write a program that:
Accepts a string.
Counts vowels, consonants, digits, and special characters.
Determines whether the code is "Strong" or "Weak" based on:
At least 2 digits
At least 1 special character
Minimum length of 8
Displays a detailed report.

 */
import java.util.*;
public class SecretMessageValidator {

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String secretMessage= sc.next();

   int vowels=0,consonants=0,digits=0,specialChas=0;
   for(int i =0;i<secretMessage.length();i++){
    char ch=secretMessage.charAt(i);
    if(Character.isDigit(ch)){
        digits++;
   }
    else if(Character.isLetter(ch)){
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
          vowels++;
      }
      else{
          consonants++;
      }
    }
    else{
      specialChas++;
    }
    }
    System.out.println(vowels);
    System.out.println(consonants);
    System.out.println(digits);
    System.out.println(specialChas);
    if(digits>=2 && specialChas>=1 && secretMessage.length()>=8){
        System.out.println("Strong");
    }
    else{
        System.out.println("Weak");
    }


  
  }
  
}
