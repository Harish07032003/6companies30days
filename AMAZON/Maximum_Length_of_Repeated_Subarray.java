package AMAZON;
import java.util.*;
public class Maximum_Length_of_Repeated_Subarray {
    public int findLength(int[] nums1, int[] nums2) {
        
        int m = nums1.length, n = nums2.length, ans = 0;
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
