class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] array = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for (char c : s1.toCharArray()) {
            array[c - 'a']++;
        }
        int r = s1.length() - 1;
        for (int l = 0; l < s2.toCharArray().length; l++) {
            int[] windowArray = new int[26];
            if (r < s2.toCharArray().length) {
            for (int i = l; i <= r; i++) {
                
                windowArray[s2.charAt(i) - 'a']++;
            }
            if (Arrays.equals(windowArray, array)) {
                return true;
            }
            }
            r++;
            
        }
        return false;
    }
}
