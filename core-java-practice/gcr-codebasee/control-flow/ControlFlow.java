



//syntax of if-else,forloop,while loop,do-while loop,swtich -case
public class ControlFlow {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        // for loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // for each loop syntax
        int[] array = {1, 2, 3, 4, 5};
        for (int element : array) {
            System.out.println(element);
        }
        // while loop
        System.out.println("While loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop
        System.out.println("Do-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

        // switch-case statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}


