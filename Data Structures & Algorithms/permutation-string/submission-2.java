class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> s2Set = new HashMap<>();
        HashMap<Character, Integer> s1Set = new HashMap<>();
        int left = 0;
        int temp = 0;
        int right = s1.length() - 1;
        while (temp <= right) {
            s2Set.put(s2.charAt(temp), s2Set.getOrDefault(s2.charAt(temp), 0) + 1);
            s1Set.put(s1.charAt(temp), s1Set.getOrDefault(s1.charAt(temp), 0) + 1);
            temp++;
        }
        if (s1Set.equals(s2Set)) {
            return true;
        }
        int s2Setval = s2Set.get(s2.charAt(left));
        if (s2Setval > 1) {
        s2Set.replace(s2.charAt(left), s2Setval - 1);
        }
        else {
            s2Set.remove(s2.charAt(left));
        }
        left++;
        right++;
        while (right < s2.length()) {
            s2Set.put(s2.charAt(right), s2Set.getOrDefault(s2.charAt(right), 0) + 1);
            if (s1Set.equals(s2Set)) {
                return true;
            }
            s2Setval = s2Set.get(s2.charAt(left));
           if (s2Setval > 1) {
        s2Set.replace(s2.charAt(left), s2Setval - 1);
        }
        else {
            s2Set.remove(s2.charAt(left));
        }
            left++;
            right++;
        }
        return false;
    }
}
