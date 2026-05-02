class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        for (int i = 0; i < nums.length -2; i++) {
            if (i > 0 && nums[i-1]==nums[i]) continue;
            int fNum = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sNum = nums[j];
                int tNum = nums[k];
                if (sNum + tNum > -fNum) {
                    k--;
                } else if (sNum + tNum < -fNum) {
                    j++;
                } else {
                    ans.add(Arrays.asList(fNum, sNum, tNum));
                    j++;
                    k--;
                    while (j < k && nums[j]==nums[j-1]) j++;
                    while (j < k && nums[k]==nums[k+1]) k--;
                    
                }
            }
        }
        return ans;
    }
}