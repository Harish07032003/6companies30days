package ADOBE;
import java.util.*;
public class people_aware_of_secret {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int arr[]=new int[n+1];
        arr[1]=1;
        int finaly=1;
        for(int i=2;i<=n;i++)
        {
            
            if(i>forget)
            {
                if(arr[i-forget]>0)
                {
                    finaly=finaly-arr[i-forget];
                    arr[i-forget]=0;
                }
            }
            int dl=i-delay;
            int sum=0;
            for(int j=0;j<=dl;j++)
            {
                sum+=arr[j];
            }
            arr[i]=sum;
            finaly+=sum;
        }
        return finaly%(int)(1e9+7);
    }
}
