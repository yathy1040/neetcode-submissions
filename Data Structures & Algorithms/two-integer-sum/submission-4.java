class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
          set.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            System.out.print(set.get(num));
            
            if (set.get(num) != null && set.get(num) != i) {
                ans[0] = i;
                ans[1] = set.get(num);
                return ans;
            }
        }
        return ans;
        
    }
}
