interface Animal{
  void eat();
  
}
class Dog implements Animal{
  public void eat (){
    System.out.println("dog is eating");
  }
}
public class NormalInterface{
  public static void main(String[] args){
    Dog d= new Dog();
    d.eat();

  }
}