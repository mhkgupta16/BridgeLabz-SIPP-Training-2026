import java.util.Scanner;
public class MaximumNumber69{
  public static void main(String[] args){

  
  Scanner sc= new Scanner(System.in);
  
  int num= sc.nextInt();
 
 
   int place=1;
  while(num/place>=10){
    place*=10;
    

  }
  while(place>0){
    int digit=(num/place)%10;
    if(digit==6){
       num= num+3*place;
      break;

    }
    place/=10;
  }
  System.out.println(num);

  }

}