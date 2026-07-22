import java.util.Stack;

public class StockProblems {

    // Next Greater Stock Price
    static void nextGreater(int[] price) {

        int n = price.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();

            stack.push(price[i]);
        }

        System.out.println("Next Greater Prices:");
        for (int x : ans)
            System.out.print(x + " ");
        System.out.println();
    }

    // Stock Span
    static void stockSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        System.out.println("Stock Span:");
        for (int x : span)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        nextGreater(price);
        stockSpan(price);
    }
}