class Solution {
    public int uniqueLetterString(String s) {
        int n = s.length();
        List<List<Integer>> map = new ArrayList<>();

        for(int i=0; i<26; i++){
            List<Integer> a = new ArrayList<>();
            a.add(-1);
            map.add(a);
        }

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            map.get(c-'A').add(i);
        }

        for(int i=0; i<26; i++){
            map.get(i).add(n);
        }

        int count = 0;
        for(int i=0; i<26; i++){
            List<Integer> idx = map.get(i);
            for(int j=1; j<idx.size()-1; j++){
                count += (idx.get(j)-idx.get(j-1)) * (idx.get(j+1)-idx.get(j));
            }
        }
        return count;
    }
}