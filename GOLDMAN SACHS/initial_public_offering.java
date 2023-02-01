import java.util.*;
public class initial_public_offering {
    public int minimumEffort(int[][] A) {
        int res = 0;
        Arrays.sort(A, (a1, a2) -> (a1[1] - a1[0]) - (a2[1] - a2[0]));
        for (int[] a : A) {
            res = Math.max(res + a[0], a[1]);
        }
        return res;
    }
}
