import java.util.*;
public class basic{
  public static void main(String[] args){
    //factorial 
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println(fact);
    //sum of array number
    int [] arr= {1,2,34,5,67,9};
    int sum=0;
    for(int i =0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }

  public static int fact(int n){
    if(n==0||n==1){
      return 1;
    }
    return n*fact(n-1);
  }
  // Tail-recursive version: call with fact(n, 1)
  public static int fact(int n, int acc){
    if(n==0||n==1){
      return acc;
    }
    return fact(n-1, n*acc);
  }
}