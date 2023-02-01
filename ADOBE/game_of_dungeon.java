package ADOBE;
import java.util.*;
public class game_of_dungeon {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int dp[][]=new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row,(int)1e9);
        return getval(dungeon,dp,0,0);
    }
    public int getval(int[][]mat ,int[][]dp,int i,int j)
    {
        int n=mat.length;
        int m=mat[0].length;
        if(i==n || j==m)
        {
            return (int)1e9;
        }
        if(i==n-1 && j==m-1)
        {
            return (mat[i][j]<=0)?-mat[i][j]+1:1;
        }
        if(dp[i][j]!=(int)1e9)
        {
            return dp[i][j];
        }
        int IfwegoRight=getval(mat,dp,i,j+1);
        int IfwegoDown=getval(mat,dp,i+1,j);
        int minhealreq=Math.min(IfwegoRight,IfwegoDown)-mat[i][j];
        dp[i][j]=(minhealreq<=0)?1:minhealreq;
            return dp[i][j];
    }
}
