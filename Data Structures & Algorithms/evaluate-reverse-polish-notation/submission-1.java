class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (token.equals("+")) {
                    int sum = num2 + num1;
                    stack.push(sum);
                }
                else if (token.equals("-")) {
                    int sum = num2 -num1;
                    stack.push(sum);
                }
                else if (token.equals("*")) {
                    int sum = num2 *num1;
                    stack.push(sum);
                }
                else if (token.equals("/")) {
                    int sum = num2 /num1;
                    stack.push(sum);
                }
            }
            else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }
        return stack.pop();
    }
}
