/* Build a 'Math Wizard' utility class:
   isPrime(n), factorial(n), fibonacci(n),
   gcd(a,b), lcm(a,b), power(base, exp).
   Overload factorial to also accept double.
   Demonstrate scope differences between local and instance variables.
*/

public class MathWizard {

    // Instance Variable
    int instancevar = 100;

    // Prime Check
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Factorial (int)
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded Factorial (double)
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci
    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    // GCD
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demonstration
    public void showScope() {
        int localvar = 50; // Local Variable

        System.out.println("Local Variable = " + localvar);
        System.out.println("Instance Variable = " + instancevar);
    }
}

class Main {
    public static void main(String[] args) {

        MathWizard obj = new MathWizard();

        System.out.println("Prime: " + obj.isPrime(13));
        System.out.println("Factorial(int): " + obj.factorial(5));
        System.out.println("Factorial(double): " + obj.factorial(5.0));
        System.out.println("Fibonacci(7): " + obj.fibonacci(7));
        System.out.println("GCD: " + obj.gcd(12, 18));
        System.out.println("LCM: " + obj.lcm(12, 18));
        System.out.println("Power: " + obj.power(2, 5));

        obj.showScope();
    }
}