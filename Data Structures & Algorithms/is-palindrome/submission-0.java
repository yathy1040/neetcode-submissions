class Solution {
    public boolean isPalindrome(String s) {
        String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
        String str2 = alphanumeric.toLowerCase();
        char[] array = str2.toCharArray();
        int start = 0;
        int end = array.length - 1;

        while (start < end ) {
            if (array[start] == array[end]) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
