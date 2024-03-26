class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o->o[1]));
        int curr = intervals[0][1];
        int count = 0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]>=curr){
                curr = intervals[i][1];
                continue;
            }
            count++;
        }

        return count;
    }
}