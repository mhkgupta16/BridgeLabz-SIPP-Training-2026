class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {

    final String studentId;
    double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Student ID: " + studentId
                + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {

    String thesis;

    GradStudent(String name, int age,
                String studentId,
                double gpa,
                String thesis) {

        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent g1 = new GradStudent(
                "Mahak",
                21,
                "CS101",
                9.2,
                "Artificial Intelligence"
        );

        System.out.println(g1);

        // IS-A relationships
        System.out.println(g1 instanceof GradStudent);
        System.out.println(g1 instanceof Student);
        System.out.println(g1 instanceof Person);
    }
}