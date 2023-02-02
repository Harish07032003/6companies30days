package GOOGLE;
import java.util.*;
public class Maximum_Number_of_Coins_You_Can_Get {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
  int k=0;
    int sum=0;
    int idx= piles.length-2;
    while(k!= ((piles.length)/3) ){
        sum=sum+piles[idx];
        idx=idx-2;
        k++;
    }
 return sum;
}
}
