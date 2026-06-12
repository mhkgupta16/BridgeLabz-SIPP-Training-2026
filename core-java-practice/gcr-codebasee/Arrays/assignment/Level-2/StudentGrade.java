import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            percentage[i] = (p + c + m) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Percentage = " +
                    percentage[i] +
                    " Grade = " +
                    grade[i]);
        }
    }
}