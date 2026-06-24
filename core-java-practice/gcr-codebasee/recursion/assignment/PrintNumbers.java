public class PrintNumbers{
  static void number(int n){
    if(n==0){
      return;
    }
    System.out.println(n+" ");
    number(n-1);
  }
  public static void main(String[] args){
    number(5);
  }
}