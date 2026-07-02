

//why use abstract class because we don't want to create object of shape class and we want to create object of circle rectangle and square class


abstract class Shape {
  abstract double area();
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  class Rectangle extends Shape{
    private Integer length;
    private Integer breadth;
    public Rectangle(Integer length,Integer breadth){
      this.length=length;
      this.breadth=breadth;
    }
    @Override
    public double area() {
      return length * breadth;
    }

  }

}
