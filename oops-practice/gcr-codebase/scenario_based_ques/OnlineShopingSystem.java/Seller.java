public class Seller extends Person{
  private String comapanyName;
  private double sellerRatng;
  public Seller(int id, String name, String email, String comapanyName, double sellerRatng) {
    super(id, name, email);
    this.comapanyName = comapanyName;
    this.sellerRatng = sellerRatng;
  }
  public String getComapanyName() {
    return comapanyName;
  }
  public double getSellerRatng() {
    return sellerRatng;
  }
  public String toString() {
    return super.toString() + " " + comapanyName + " " + sellerRatng;
  }
}
