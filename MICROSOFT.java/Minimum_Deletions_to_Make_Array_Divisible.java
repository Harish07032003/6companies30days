import java.util.*;
public class Minimum_Deletions_to_Make_Array_Divisible {
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        else
        {
            return gcd(b%a,a);
        }
    }
    public int minOperations(int[] num, int[] nums) {
        int res=nums[0];
        for(int i:nums)
        {
            res=gcd(res,i);
        }
        Arrays.sort(num);
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(res%num[i]!=0)
            {
                count++;
            }
            else
            {
                return count;
            }
        }
        return -1;
    }
}
