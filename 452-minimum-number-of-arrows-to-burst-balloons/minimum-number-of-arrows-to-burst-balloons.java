class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingDouble(o -> o[1]));
        int curr = points[0][1];
        int count = 1;
        for(int i=1; i<points.length; i++){
            if(curr >= points[i][0]){
                continue;
            }
            count++;
            curr = points[i][1];
        }
        return count;
    }
}