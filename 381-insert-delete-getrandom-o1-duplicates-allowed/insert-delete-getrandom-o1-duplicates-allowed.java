public class RandomizedCollection {
    ArrayList<Integer> ans;
    HashMap<Integer, Set<Integer>> idx;
    Random r = new Random();

    public RandomizedCollection() {
        ans = new ArrayList<>();
        idx = new HashMap<>();
    }

    public boolean insert(int val) {
        if (!idx.containsKey(val)) idx.put(val, new HashSet<>());
        idx.get(val).add(ans.size());
        ans.add(val);
        return idx.get(val).size() == 1;
    }

    public boolean remove(int val) {
        if (!idx.containsKey(val) || idx.get(val).size() == 0) return false;
        int removeIdx = idx.get(val).iterator().next();
        idx.get(val).remove(removeIdx);
        int last = ans.get(ans.size() - 1);
        ans.set(removeIdx, last);
        idx.get(last).add(removeIdx);
        idx.get(last).remove(ans.size() - 1);

        ans.remove(ans.size() - 1);
        return true;
    }

    public int getRandom() {
        return ans.get(r.nextInt(ans.size()));
    }
}