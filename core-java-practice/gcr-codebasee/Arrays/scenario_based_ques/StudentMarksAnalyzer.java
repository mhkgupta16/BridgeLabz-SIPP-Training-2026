/*1. Student Marks Analyzer 

A teacher has recorded marks of students in an array.
Write a program that:
Accepts marks of students.
Finds the highest and lowest marks.
Counts how many students scored above 75.
Calculates the average marks.
Displays all marks greater than the average.
 */

import java.util.*;
public class StudentMarksAnalyzer{
  static double average(int arr[]){
    int sum=0;
    for(int i =0;i<arr.length;i++){
      sum+=arr[i];
    }
    return (double)sum/arr.length;
  }
  static void analyze(int arr[]){
    int max=arr[0];
    int min=arr[0];
    int count=0;
    double avg=average(arr);
    for(int i =0;i<arr.length;i++){
      if(arr[i]>max)
      max=arr[i];
      if(arr[i]<min){
        min=arr[i];
      }
      if(arr[i]>75){
        count++;
      }

    }
   
     System.out.println("Highest Marks = " + max);
        System.out.println("Lowest Marks = " + min);
        System.out.println("Students Above 75 = " + count);
        System.out.println("Average = " + avg);

        System.out.print("Marks Greater Than Average: ");

        for(int i =0;i<arr.length;i++){
          if(arr[i]>avg){
            System.out.println(arr[i]+" ");
          }
        }


  }
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int  n = sc.nextInt();
  int arr[]= new int [n];
  
    for(int i =0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  
   analyze(arr);
  }
}
