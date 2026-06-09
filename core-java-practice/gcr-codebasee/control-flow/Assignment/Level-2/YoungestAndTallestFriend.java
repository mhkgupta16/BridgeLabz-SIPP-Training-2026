import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        String youngest = "";
        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        if (minAge == amarAge)
            youngest = "Amar";
        else if (minAge == akbarAge)
            youngest = "Akbar";
        else
            youngest = "Anthony";

        String tallest = "";
        double maxHeight = Math.max(amarHeight,
                Math.max(akbarHeight, anthonyHeight));

        if (maxHeight == amarHeight)
            tallest = "Amar";
        else if (maxHeight == akbarHeight)
            tallest = "Akbar";
        else
            tallest = "Anthony";

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
    }
}