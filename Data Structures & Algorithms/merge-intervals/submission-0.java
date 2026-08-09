class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
        Integer.compare(a[0], b[0]));

        ArrayList<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int j = i+ 1;
            int start = intervals[i][0];
            int end = intervals[i][1];
           while (j < intervals.length && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            int [] addA = new int[2];
            addA[0] = start;
            addA[1] = end;
            mergedIntervals.add(addA);
            i = j -1;

        }
      return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }
}
