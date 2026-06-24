
/*2.  Maya’s BMI Fitness Tracker
Maya, a fitness coach, wants to record the BMI of her clients.
●              Ask for height and weight.
●              Use formula BMI = weight / (height * height)
●              Print category using if-else: Underweight, Normal, Overweight.
 
Use clear variable names and comments to maintain code hygiene.
 */



import java.util.*;
public class MayaFitnessTracker{
  public static double calculateBMIT(double weight, double height){
    return weight/(height*height);

  }
  public static void category(double bmi){
    if(bmi<18.5){
      System.out.println("Category: Underweight");
    }
    else if(bmi>=18.5 && bmi<24.9){
      System.out.println("Category: Normal");
    }
    else{
      System.out.println("Category: Overweight");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("Enter weight in kg (or type 'exit' to quit): ");
      String weightInput = sc.nextLine();
      if(weightInput.equalsIgnoreCase("exit")){
        break;
      }
      double weight = Double.parseDouble(weightInput);

      System.out.print("Enter height in meters: ");
      double height = sc.nextDouble();
      sc.nextLine(); // Consume the newline character

      double bmi = calculateBMIT(weight, height);
      System.out.printf("Your BMI is: %.2f\n", bmi);
      category(bmi);
    }
    sc.close();
  }
}