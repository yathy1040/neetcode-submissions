class Solution {
    public String minWindow(String s, String t) {
        String shortest = "";
        int bestStart = 0;
        int minimum = Integer.MAX_VALUE;
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> tFreq = new HashMap<>();
        HashMap<Character, Integer> sFreq = new HashMap<>();

        int left = 0;
        int right = 0;
        for (int i = 0; i < t.length(); i++) {
            tFreq.put(t.charAt(i), tFreq.getOrDefault(t.charAt(i), 0) + 1);
        }
        boolean valid = true;
        
        while (right < s.length()) {
            
            sFreq.put(s.charAt(right), sFreq.getOrDefault(s.charAt(right), 0) + 1);
            valid = true;
            for (Map.Entry<Character, Integer> entry : tFreq.entrySet()) {
                char c = entry.getKey();
                int required = entry.getValue();

                if (sFreq.getOrDefault(c, 0) < required) {
                    valid = false;
                    break;
                }   
            }
            while (valid) {
                int currentLength = right - left + 1;

                if (currentLength < minimum) {
                    minimum = currentLength;
                    bestStart = left;
                }       
                int leftVal = sFreq.get(s.charAt(left));
                sFreq.replace(s.charAt(left), leftVal - 1);
                left++;
                for (Map.Entry<Character, Integer> entry : tFreq.entrySet())        
                {
                    char c = entry.getKey();
                    int required = entry.getValue();

                    if (sFreq.getOrDefault(c, 0) < required) {
                        valid = false;
                        break;
                    }   
                }
            
            }
            right++;
        }
        return minimum == Integer.MAX_VALUE
    ? ""
    : s.substring(bestStart, bestStart + minimum);
    }
    
    
}
