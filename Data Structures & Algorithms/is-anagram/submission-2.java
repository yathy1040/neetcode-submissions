class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sE = new HashMap();
        HashMap<Character, Integer> tE = new HashMap();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
           sE.put(s.charAt(i), sE.getOrDefault(s.charAt(i), 0) + 1);
           tE.put(t.charAt(i), tE.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sE.equals(tE);
    }
}
