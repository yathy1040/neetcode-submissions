class Solution {
    public int findMin(int[] nums) {
       int l = 0; int r = nums.length - 1;
       int mid = 0;
       while (l < r) {
        mid = l + (r-l)/2;
        System.out.print(mid);
        if (nums[mid] > nums[r]) {
            l = mid + 1;
        }
        else {
            r = mid;
        }
       }
       return nums[r];
    }
}
