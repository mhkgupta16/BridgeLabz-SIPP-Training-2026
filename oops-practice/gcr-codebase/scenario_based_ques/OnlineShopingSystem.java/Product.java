
public class Product {

  private int productId;
  private String productName;
  private String category;
  private double price;
  private double rating;
  private boolean inStock;
  private String seller;

  public Product(int productId, String productName, String category,
      double price, double rating,
      boolean inStock, String seller) {

    this.productId = productId;
    this.productName = productName;
    this.category = category;
    this.price = price;
    this.rating = rating;
    this.inStock = inStock;
    this.seller = seller;
  }

  public int getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public String getCategory() {
    return category;
  }

  public double getPrice() {
    return price;
  }

  public double getRating() {
    return rating;
  }

  public boolean isInStock() {
    return inStock;
  }

  public String getSeller() {
    return seller;
  }

  @Override
  public String toString() {
    return productId + " " + productName +
        " Price:" + price +
        " Rating:" + rating +
        " Stock:" + inStock +
        " Seller:" + seller;
  }
}