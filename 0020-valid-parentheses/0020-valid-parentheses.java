class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        char[] stack = new char[len];
        int top = -1;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else {
                if (top < 0) {
                    return false;
                }
                char topChar = stack[top--];
                if ((c == ')' && topChar != '(') ||
                    (c == ']' && topChar != '[') ||
                    (c == '}' && topChar != '{')) {
                    return false;
                }
            }
        }
        return top == -1;
    }
}