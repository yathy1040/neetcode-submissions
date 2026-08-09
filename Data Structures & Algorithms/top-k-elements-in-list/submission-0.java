class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
       HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) ->
       Integer.compare(hash.get(b), hash.get(a)));
       Set<Integer> set = hash.keySet();
       for (int j : set) {
        heap.add(j);
       }
       int[] kFrequent = new int[k];
       for (int i = 0; i < k; i++) {
        kFrequent[i] = heap.poll();
       }
       return kFrequent;
    }
    
    
}
