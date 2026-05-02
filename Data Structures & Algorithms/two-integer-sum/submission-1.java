class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> ht = new Hashtable();
        for (int i = 0; i < nums.length; i++) {
            ht.put(nums[i], i);
        }
        int targets[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (ht.get(num) != null) {
                if (i < ht.get(num)) {
                targets[0] = i;
                targets[1] = ht.get(num);
                }
                else if (i > ht.get(num)) {
                   targets[0] = ht.get(num);
                targets[1] = i; 
                }
            }
        }
        
        return targets;
    }
}
