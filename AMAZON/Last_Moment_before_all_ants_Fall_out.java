package AMAZON;
import java.util.*;
public class Last_Moment_before_all_ants_Fall_out {
    public int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;
        for (int i: left)
            res = Math.max(res, i);
        for (int i: right)
            res = Math.max(res, n - i);
        return res;
    }
}
