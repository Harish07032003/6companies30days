import java.util.*;
public class combinations_III_sum {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> ans=new ArrayList<>();
            int arr[]=new int[10];
            for(int i=0;i<10;i++)
            {
                arr[i]=i+1;
            }
            for(int i=1;i<=k;i++)
            {
                for(int j=0;j<10;j++)
                {
                    arr[j]+=i;
                    if(arr[j]==n && i==8)
                    {
            System.out.println(Arrays.toString(arr));
                    }
                }
            }
            return ans;
        }
    
}
