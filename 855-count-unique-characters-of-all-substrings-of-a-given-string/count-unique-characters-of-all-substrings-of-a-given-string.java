class Solution {
    public int uniqueLetterString(String s) {
        int n = s.length();
        List<List<Integer>> hashmap = new ArrayList<>();

        // Initialize lists with -1
        for (int i = 0; i < 26; ++i) {
            List<Integer> list = new ArrayList<>();
            list.add(-1);
            hashmap.add(list);
        }

        // Store all indices
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            hashmap.get(ch - 'A').add(i);
        }

        // Push length of string for all keys at the end of each value list
        for (int i = 0; i < 26; ++i) {
            hashmap.get(i).add(n);
        }

        long count = 0;
        for (int i = 0; i < 26; ++i) {
            List<Integer> indices = hashmap.get(i);
            for (int j = 1; j < indices.size() - 1; ++j) {
                count += (indices.get(j) - indices.get(j - 1)) * (indices.get(j + 1) - indices.get(j));
                
            }
        }
        return (int) count;
    }
}