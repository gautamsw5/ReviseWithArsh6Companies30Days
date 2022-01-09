class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add((long)1);
        for(int i = 1; i < n; i++) {
            long u = set.first();
            set.remove(u);
            set.add(u*2);
            set.add(u*3);
            set.add(u*5);
        }
        return set.first();
    }
}
