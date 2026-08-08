class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0; int right = 0;
        int size = 0; int maxSize = 0;
        HashSet<Character> set = new HashSet();
        char[] array = s.toCharArray();

        for (char c : array) {
            if (set.add(c)) {
                right++;
                size++;
                maxSize = Math.max(size, maxSize);
            }
            else {
                while (!set.add(c)) {
                    set.remove(array[left]);
                    size--;
                    left++;
                
                }
                set.add(c);
                size++;
            }
        }
        return maxSize;
    }
}
