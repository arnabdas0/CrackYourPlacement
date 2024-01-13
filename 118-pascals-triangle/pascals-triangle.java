class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0){
            return ans;
        }

        if(numRows == 1){
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            ans.add(firstRow);
            return ans;
        }

        ans = generate(numRows-1);
        List<Integer> prevRow = ans.get(numRows-2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);

        for(int i=1; i<numRows-1; i++){
            currRow.add(prevRow.get(i-1)+prevRow.get(i));
        }

        currRow.add(1);
        ans.add(currRow);

        return ans;
    }
}