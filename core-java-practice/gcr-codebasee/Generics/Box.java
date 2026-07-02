class Box<T> {
  private T data;

// constructor
  Box(T data) {
    this.data = data;
  }

  // get method
  public T getData() {
    return data;
  }
  //set method
  public void setData(T data){
    this.data=data;
  }
  public static void main(String[] args){
    Box<Integer> box1 = new Box<>(10);
    Box<String> box2=new Box<>("hello");
    System.out.println( box1.getData());
    System.out.println(box2.getData());
    box1.setData(20);
    box2.setData("world");
    System.out.println(box1.getData());
    System.out.println(box2.getData());



  }

}