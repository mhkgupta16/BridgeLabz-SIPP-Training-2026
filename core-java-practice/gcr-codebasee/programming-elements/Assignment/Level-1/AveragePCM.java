public class AveragePCM {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double totalMarks = maths + physics + chemistry;
        double percentage = (totalMarks / 300) * 100;

        System.out.println("Sam's average percentage in PCM is " + percentage + "%");
    }
}