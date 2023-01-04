import java.util.*;
class Rotate_Function {
    public static int maxRotateFunction(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        int array_sum=0;
        int sum=0;
        int len=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            array_sum+=i*nums[i];
            sum+=nums[i];
        }
        int max=array_sum;
        for(int i=len-1;i>=0;i--)
        {
            array_sum=array_sum+sum-(len*nums[i]);
            max=Math.max(array_sum,max);
        }
        return max;
    }

public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println(maxRotateFunction(arr1));
    }
    
}
