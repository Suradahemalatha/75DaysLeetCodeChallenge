import java.util.ArrayDeque;
public class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y / x);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}