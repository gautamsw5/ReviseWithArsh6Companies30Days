class Solution {
    boolean inside(int px, int py, int[] L, int[] R) {
        return px >= L[0] && px <= R[0] && py >= R[1] && py <= L[1];
    }
    // z1 bw z2
    boolean bw(int[] z1, int[] z2) {
        return z1[0] >= z2[0] && z1[0] <= z2[1] && z1[1] >= z2[0] && z1[1] <= z2[1];
    }
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if(inside(L1[0], L1[1], L2, R2) || inside(R1[0], L1[1], L2, R2) || inside(L1[0], R1[1], L2, R2) || inside(R1[0], R1[1], L2, R2)) return 1;
        else if(inside(L2[0], L2[1], L1, R1) || inside(R2[0], L2[1], L1, R1) || inside(L2[0], R2[1], L1, R1) || inside(R2[0], R2[1], L1, R1)) return 1;
        else if(bw(new int[]{R1[1], L1[1]}, new int[]{R2[1], L2[1]}) && bw(new int[]{L2[0], R2[0]}, new int[]{L1[0], R1[0]})) return 1;
        else if(bw(new int[]{R2[1], L2[1]}, new int[]{R1[1], L1[1]}) && bw(new int[]{L1[0], R1[0]}, new int[]{L2[0], R2[0]})) return 1;
        else return 0;
    }
}
