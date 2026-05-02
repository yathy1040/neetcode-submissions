class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ptr1 = 1;
        int ptr2 = numbers.length;

        while (true) {
            if (numbers[ptr1-1] + numbers[ptr2-1] > target) {
                ptr2--;
            }
            else if (numbers[ptr1-1] + numbers[ptr2-1] < target){
                ptr1++;
            }
            else {
                return new int[]{ptr1, ptr2};
            }
            
        }
    }
}
