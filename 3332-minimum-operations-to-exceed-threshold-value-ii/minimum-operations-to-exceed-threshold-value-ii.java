class Solution {
    public int minOperations(int[] v, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        int n = v.length;
        for (int i = 0; i < n; i++)
            q.add((long) v[i]);
        int c = 0;
        while (q.size() >= 2) {
            if (q.peek() >= k)
                return c;
            long a = q.poll();
            long b = q.poll();
            long x = Math.min(a, b) * 2 + Math.max(a, b);
            q.add(x);
            c++;
        }
        return c;
    }
}
