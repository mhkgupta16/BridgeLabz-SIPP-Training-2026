/*
 2.    Raj’s Result Generator
Raj runs a coaching center. He needs to generate results.
● Input 5 subject marks.
● Calculate average.
● Switch to assign grades.
● for-loop to iterate over subjects.
 */

import java.util.Scanner;
public class RajResultGenerator {
  public static void inputMarks(int[] marks,Scanner sc){
    for(int i = 0;i<marks.length;i++){
      System.out.println("Enter marks for subject " + (i+1) + ":");
      marks[i] = sc.nextInt();
    }
  }

  public static double calculateAverage(int[] marks){
   int sum=0;
   for(int i =0;i<marks.length;i++){
    sum+=marks[i];
   }
   return (double) sum/marks.length;
  }
  public static void assignGrade(double average){
    switch((int)average/10){
      case 10:
        System.out.println("Grade: A+");
        break;
      case 9:
        System.out.println("Grade: A");
        break;
      case 8:
        System.out.println("Grade: B");
        break;
      case 7:
                    System.out.println("Grade: C");
                    break;
                      case 6:
                        System.out.println("Grade: D");
                        break;
                          case 5:
                            System.out.println("Grade: E");
                             break;
                             default:
                                System.out.println("Grade: F");
          
    }
  }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int [] marks= new int[5];
    inputMarks(marks,sc);
    double average=calculateAverage(marks);
    System.out.println("Average: " + average);
    assignGrade(average);
    sc.close();

  }
  
}
