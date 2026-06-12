import java.util.Random;

public class StudentGradeSystem {

    public static int[][] generate(int n) {
        Random r = new Random();
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = r.nextInt(50) + 50;
            marks[i][1] = r.nextInt(50) + 50;
            marks[i][2] = r.nextInt(50) + 50;
        }
        return marks;
    }

    public static String[][] process(int[][] marks) {
        String[][] res = new String[marks.length][5];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double per = total / 3.0;

            String grade = (per >= 90) ? "A" :
                    (per >= 75) ? "B" :
                            (per >= 60) ? "C" : "D";

            res[i][0] = String.valueOf(total);
            res[i][1] = String.valueOf(avg);
            res[i][2] = String.valueOf(per);
            res[i][3] = grade;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] marks = generate(5);
        String[][] res = process(marks);

        System.out.println("Total Avg Per Grade");

        for (String[] r : res) {
            System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);
        }
    }
}