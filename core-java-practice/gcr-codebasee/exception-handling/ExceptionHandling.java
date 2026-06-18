import java.io.FileNotFoundException;
public class ExceptionHandling {
  static void method1(){
    try{
      ProductService.claculateTotal();
      System.out.println("yeahhh");
    }
    catch(FileNotFoundException e){
      System.out.println("noooooooooo");
      throw new RuntimeException(e);
    } 
  }
  public static void method2(){
    
  }
  public static void main(String[] args){
    method1();
  }
  
}
