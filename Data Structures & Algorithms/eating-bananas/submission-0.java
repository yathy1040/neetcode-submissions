class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        for (int val : piles) {
            r = Math.max(val, r);
        }
        while (l < r) {
            int k = l + (r - l) / 2;
            long totalTime = 0;
            for (int val: piles) {
                totalTime += Math.ceil((double)val/k);
            }
            if (totalTime <= h) {
                r = k;
            }
            else {
                l = k + 1;
            }
        }
        return l;
    }
}
