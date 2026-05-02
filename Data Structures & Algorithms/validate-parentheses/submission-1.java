class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            }
            else {
                if (chars[i] == '}' && !stack.empty() && stack.peek() == '{' ) {
                    stack.pop();
                }
                else if (chars[i] == ')' && !stack.empty() && stack.peek() == '(' ) {
                    stack.pop();
                }
                else if (chars[i] == ']' && !stack.empty() && stack.peek() == '[' ) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (stack.empty()) return true;
        else return false;
    }
}
