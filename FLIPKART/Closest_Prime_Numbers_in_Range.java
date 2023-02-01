package FLIPKART;
import java.util.*;
public class Closest_Prime_Numbers_in_Range {
    public int[] closestPrimes(int left, int right) {
        int arr[]=new int[right+1];
        int res_arr[]=new int[2];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=right;i++)
        {
            for(int j=i+i;j<=right;j+=i)
            {
                    arr[j]=-1;
            }
        }
        for(int i=left;i<arr.length;i++)
        {
            if(arr[i]==0&&i!=1)
            {
                list.add(i);
            }
        }
        System.out.println(list);
       
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
        {
            int diff=Math.abs(list.get(i)-list.get(i+1));
           // result=Math.min(result,diff);
            if(diff<temp)
            {
                res_arr[0]=list.get(i);
                res_arr[1]=list.get(i+1);
                temp=list.get(i+1)-list.get(i);
            }
        }
           
            if(res_arr[0]==0||res_arr[1]==0)
            {
                res_arr[0]=-1;
                res_arr[1]=-1;
            }
            
    
        return res_arr;
    }
}
