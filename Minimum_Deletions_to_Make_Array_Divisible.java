import java.util.*;
class ArrayDivisible {
    public static int gcd(int a,int b)
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
    public static int minOperations(int[] num, int[] nums) {
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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println(minOperations(arr1,arr2));

    }
}
