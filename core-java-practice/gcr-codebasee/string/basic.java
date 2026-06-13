public class basic{
  public static void main(String[] args){
    String s="mahak";
    System.out.println(s.length());
    String p="hello";
    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(1));


    for(int i =0;i<s.length();i++){
      System.out.println(s.charAt(i));

    }

    String s1="hello";
    String s2="hello";
    String s3=new String("hello");
    System.out.println(s1.equals(s2));
    System.out.println(s1==s2);
    System.out.println(s1.equals(s3));
    System.out.println(s1==s3);

    s.toUpperCase();
    System.out.println(s);
    s=s.toUpperCase();
    System.out.println(s);

    String s4="gupta";
    String result=" ";
    for(int i =s.length()-1;i>=0;i--){
      result+=s.charAt(i);


    }
    System.out.println(result);
    //Palindrome check
     String s5="madam";
     String rev="";
     for(int i =s5.length()-1;i>=0;i--){
      rev+=s5.charAt(i);
     }
     
     if(s5.equals(rev)){
      System.out.println("Palindrome");
     }
     else{
      System.out.println("Not Palindrome");
     }
  }
}

