class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        String output = s.replaceAll("[^a-zA-Z0-9]", "");
        String output2 = output.toLowerCase();
        char[] array = output2.toCharArray();
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
