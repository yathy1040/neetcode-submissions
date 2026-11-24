class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temps = new Stack<>();
        int[] answers = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (temps.empty()) {
                temps.push(i);
            }
            else {

                if (temperatures[temps.peek()] > temperatures[i]) {
                    temps.push(i);
                }
                else {
                    while (!temps.empty() && temperatures[i] > temperatures[temps.peek()]) {
                        
                        int val = temps.pop();
                        answers[val] = i - val;
                    }
                    temps.push(i);
                }
            }
        }
        return answers;
    }
}
