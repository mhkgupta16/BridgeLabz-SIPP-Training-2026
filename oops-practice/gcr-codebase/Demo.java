class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

   
    
    
}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("Mahak");
        Student s2 = new Student("Mahak");

        System.out.println(s1.equals(s2));
    }
}