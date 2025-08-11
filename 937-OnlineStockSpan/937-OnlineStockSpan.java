// Last updated: 8/12/2025, 12:40:43 AM
import java.util.Stack;

class StockSpanner {

    // Stack stores pairs: [price, span]
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop elements from stack as long as current price >= top price
        while (!stack.isEmpty() && price >= stack.peek()[0]) {
            span += stack.pop()[1]; // accumulate span
        }

        // Push current price and its span
        stack.push(new int[]{price, span});
        return span;
    }
}
