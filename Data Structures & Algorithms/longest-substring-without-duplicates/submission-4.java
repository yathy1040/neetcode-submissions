class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sChar = s.toCharArray();
        int l = 0;
        HashSet<Character> uniqueSet = new HashSet<>();
        if (sChar.length == 0) {
            return 0;
        }
        int longest = 0;
        for (int r = 0; r < sChar.length; r++) {
            while (uniqueSet.contains(sChar[r])) {
                uniqueSet.remove(sChar[l]);
                l++;
            }
            uniqueSet.add(sChar[r]);
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }
}
