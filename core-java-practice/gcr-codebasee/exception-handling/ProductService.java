
//airthmetic exception (number dib by 0) 
import java.io.*;

public class ProductService {
  // checked exception
  static void claculateTotal() throws FileNotFoundException {
    File fr = new File("abc");
    FileReader fileReader = new FileReader("fr");
    // InputStreamReader isr = new InputStreamReader(fr);

  }

  public static void main(String[] args) {
    System.out.println(" airthmetic");
    try {
      int res = 10 / 0;
      System.out.println(res);
    } catch (ArithmeticException e) {
      System.out.println("not div by zero");
    }
    // nullpointer exception
    String name = null;
    int n = name.length();
    System.out.println(n);

  }

}