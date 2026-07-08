// Provide a simple Person class here so Customer can compile standalone
class Person {
  protected int id;
  protected String name;
  protected String email;

  public Person(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return id + " " + name + " " + email;
  }
}

public class Customer extends Person {
  private String city;
  private boolean primeMinister;

  public Customer(int id, String name, String email, String city, boolean primeMinister) {
    super(id, name, email);
    this.city = city;
    this.primeMinister = primeMinister;
  }

  public String getCity() {
    return city;
  }

  public boolean isPrimeMinister() {
    return primeMinister;
  }

  public String toString() {
    return super.toString() + " " + city + " " + primeMinister;
  }
}
