class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!hashS.containsKey(s.charAt(i))) {
                hashS.put(s.charAt(i), 1);
            }
            else {
                int val = hashS.get(s.charAt(i));
                hashS.replace(s.charAt(i), ++val);
            }
            if (!hashT.containsKey(t.charAt(i))) {
                hashT.put(t.charAt(i), 1);
            }
            else {
                int val = hashT.get(t.charAt(i));
                hashT.replace(t.charAt(i), ++val);
            }
        }
        if (hashS.equals(hashT)) {
            return true;
        }
        else {
            return false;
        }
    }
}
