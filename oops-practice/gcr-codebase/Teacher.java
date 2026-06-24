
public class Teacher {
  int id;
  String name;
  String type;

  Teacher(int id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public String toString() {
    return "Teacher{id=" + id + ",name=" + name + ", type=" + type + "}";
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this==obj)
      return true;

    if (obj==null||getClass()!=obj.getClass())
      return false;
    Teacher other=(Teacher) obj;
    return id==other.id
        && java.util.Objects.equals(name, other.name)
        && java.util.Objects.equals(type, other.type);
  }

  public static void main(String[] args) {

    Teacher a1=new Teacher(1, "MANU", "Frontend");
    Teacher a2 = new Teacher(1, "MANU", "Frontend");
    System.out.println(a2);
    System.out.println(a1==a2);

    System.out.println(a1.equals(a2));

    System.out.println(a1.hashCode());
    System.out.println(a2.hashCode());

  }
}
