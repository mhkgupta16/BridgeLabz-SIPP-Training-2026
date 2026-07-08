import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  // Local Product class to match usages in this Main file. This avoids
  // dependency on an external Product constructor signature.
  static class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;

    public Product(int productId, String productName, String category, double price, double rating) {
      this.productId = productId;
      this.productName = productName;
      this.category = category;
      this.price = price;
      this.rating = rating;
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

    // For compatibility with stream filters in this Main file
    public boolean isInStock() {
      return true;
    }

    // Return a dummy Seller to avoid null checks in grouping
    public Seller getSeller() {
      return new Seller(0, "Unknown", "", "Unknown", 0.0);
    }

    @Override
    public String toString() {
      return "Product{" + productId + ", '" + productName + "', " + category + ", " + price + ", " + rating + "}";
    }
  }

  // Local Customer class to provide required methods used in Main
  static class Customer {
    private int id;
    private String name;
    private String email;
    private String city;
    private boolean primeMember;

    public Customer(int id, String name, String email, String city, boolean primeMember) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.city = city;
      this.primeMember = primeMember;
    }

    public String getName() {
      return name;
    }

    public String getCity() {
      return city;
    }

    public boolean isPrimeMember() {
      return primeMember;
    }

    @Override
    public String toString() {
      return "Customer{" + id + ", '" + name + "', '" + email + "', '" + city + "', " + primeMember + "}";
    }
  }

  // Local Seller class to provide required methods used in Main
  static class Seller {
    private int id;
    private String name;
    private String email;
    private String shopName;
    private double sellerRating;

    public Seller(int id, String name, String email, String shopName, double sellerRating) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.shopName = shopName;
      this.sellerRating = sellerRating;
    }

    public String getName() {
      return name;
    }

    public double getSellerRating() {
      return sellerRating;
    }

    @Override
    public String toString() {
      return "Seller{" + id + ", '" + name + "', '" + shopName + "', " + sellerRating + "}";
    }
  }

  public static void main(String[] args) {

    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Seller> sellers = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();

    // ================= SELLERS =================
    Seller s1 = new Seller(1, "Rahul", "rahul@gmail.com", "TechWorld", 4.8);
    Seller s2 = new Seller(2, "Amit", "amit@gmail.com", "MobileHub", 4.3);
    Seller s3 = new Seller(3, "Neha", "neha@gmail.com", "FashionStore", 4.9);

    sellers.add(s1);
    sellers.add(s2);
    sellers.add(s3);

    // ================= CUSTOMERS =================
    customers.add(new Customer(1, "Riya", "riya@gmail.com", "Delhi", true));
    customers.add(new Customer(2, "Aman", "aman@gmail.com", "Noida", false));
    customers.add(new Customer(3, "Sneha", "sneha@gmail.com", "Delhi", true));
    customers.add(new Customer(4, "Rohan", "rohan@gmail.com", "Mumbai", false));

    // ================= PRODUCTS =================
    products.add(new Product(101, "Laptop", "Electronics", 70000.0, 4.8));
    products.add(new Product(102, "Phone", "Electronics", 25000.0, 4.7));
    products.add(new Product(103, "Shoes", "Fashion", 3000.0, 4.2));
    products.add(new Product(104, "Watch", "Fashion", 2000.0, 4.5));
    products.add(new Product(105, "Keyboard", "Electronics", 1200.0, 4.6));
    products.add(new Product(106, "Mouse", "Electronics", 700.0, 4.4));
    products.add(new Product(107, "Bag", "Fashion", 1500.0, 4.1));
    products.add(new Product(108, "Headphones", "Electronics", 1800.0, 4.9));

    // ================= 1. Display Product Names =================
    System.out.println("\n1. Product Names");
    products.stream()
        .map(Product::getProductName)
        .forEach(System.out::println);

    // ================= 2. Products In Stock =================
    System.out.println("\n2. Products In Stock");
    products.stream()
        .filter(Product::isInStock)
        .forEach(System.out::println);

    // ================= 3. Products Price > 1000 =================
    System.out.println("\n3. Products Price > 1000");
    products.stream()
        .filter(p -> p.getPrice() > 1000)
        .forEach(System.out::println);

    // ================= 4. Prime Customers =================
    System.out.println("\n4. Prime Customers");
    customers.stream()
        .filter(c -> c.isPrimeMember())
        .forEach(System.out::println);

    // ================= 5. Seller Rating > 4.5 =================
    System.out.println("\n5. Sellers Rating > 4.5");
    sellers.stream()
        .filter(s -> s.getSellerRating() > 4.5)
        .forEach(System.out::println);

    // ================= 6. Sort Products by Price =================
    System.out.println("\n6. Products Sorted by Price");
    products.stream()
        .sorted(Comparator.comparing(Product::getPrice))
        .forEach(System.out::println);

    // ================= 7. Sellers Sorted by Rating =================
    System.out.println("\n7. Sellers Sorted by Rating");
    sellers.stream()
        .sorted(Comparator.comparing(Seller::getSellerRating).reversed())
        .forEach(System.out::println);

    // ================= 8. Unique Categories =================
    System.out.println("\n8. Unique Categories");
    products.stream()
        .map(Product::getCategory)
        .distinct()
        .forEach(System.out::println);

    // ================= 9. Count Products In Stock =================
    System.out.println("\n9. Count Products In Stock");
    long count = products.stream()
        .filter(Product::isInStock)
        .count();

    System.out.println(count);

    // ================= 10. Cheapest Product =================
    System.out.println("\n10. Cheapest Product");
    System.out.println(products.stream()
        .min(Comparator.comparing(Product::getPrice))
        .get());

    // ================= 11. Costliest Product =================
    System.out.println("\n11. Costliest Product");
    System.out.println(products.stream()
        .max(Comparator.comparing(Product::getPrice))
        .get());
    // ================= 12. Average Price =================
    double avg = products.stream()
        .collect(Collectors.averagingDouble(Product::getPrice));

    System.out.println("\n12. Average Price = " + avg);

    // ================= 13. Total Value =================
    double total = products.stream()
        .map(Product::getPrice)
        .reduce(0.0, Double::sum);

    System.out.println("\n13. Total Value = " + total);

    // ================= 14. Check if All Products are In Stock =================
    boolean all = products.stream()
        .allMatch(Product::isInStock);

    System.out.println("\n14. All Products In Stock : " + all);

    // ================= 15. Check Any Customer from Delhi =================
    boolean delhi = customers.stream()
        .anyMatch(c -> c.getCity().equalsIgnoreCase("Delhi"));

    System.out.println("\n15. Any Customer From Delhi : " + delhi);

    // ================= 16. First Prime Customer =================
    System.out.println("\n16. First Prime Customer");

    Customer firstPrime = customers.stream()
        .filter(c -> c.isPrimeMember())
        .findFirst()
        .get();

    System.out.println(firstPrime);

    // ================= 17. Top 3 Highest Rated Products =================
    System.out.println("\n17. Top 3 Highest Rated Products");

    products.stream()
        .sorted(Comparator.comparing(Product::getRating).reversed())
        .limit(3)
        .forEach(System.out::println);

    // ================= 18. Group Products by Category =================
    System.out.println("\n18. Group Products By Category");

    Map<String, List<Product>> categoryMap = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory));

    System.out.println(categoryMap);

    // ================= 19. Group Products by Seller =================
    System.out.println("\n19. Group Products By Seller");

    Map<String, List<Product>> sellerMap = products.stream()
        .collect(Collectors.groupingBy(
            p -> p.getSeller().getName()));

    System.out.println(sellerMap);

    // ================= 20. Partition Products =================
    System.out.println("\n20. Partition Products");

    Map<Boolean, List<Product>> partition = products.stream()
        .collect(Collectors.partitioningBy(Product::isInStock));

    System.out.println(partition);

    // ================= 21. Create Map<ProductId, Product> =================
    System.out.println("\n21. Product Map");

    Map<Integer, Product> productMap = products.stream()
        .collect(Collectors.toMap(
            Product::getProductId,
            p -> p));

    System.out.println(productMap);

    // ================= 22. Join Customer Names =================
    System.out.println("\n22. Customer Names");

    String names = customers.stream()
        .map(Customer::getName)
        .collect(Collectors.joining(", "));

    System.out.println(names);

  }
}