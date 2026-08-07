class Solution {
    public boolean isValid(String s) {
        char[] charList = s.toCharArray();
        Stack<Character> stack = new Stack();

        for (char c : charList) {
            if (c == '{') {
                stack.push(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == '[') {
                stack.push(c);
            }
            
            else {
                if (stack.size() == 0) return false;
                if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                }
                else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                }
                else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (stack.size() > 0) return false;
        else return true;
    }
}
