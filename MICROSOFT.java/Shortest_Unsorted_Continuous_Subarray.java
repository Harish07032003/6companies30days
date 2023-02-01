import java.util.*;
public class Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=new int[nums.length];
        int a=0;
        for(int i:nums)
        {
            arr[a++]=i;
        }
        Arrays.sort(nums);
        int count=0;
        int arr1[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arr[i])
            {
                arr1[0]=i;
                // System.out.println(nums[i]);
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=arr[i])
            {
                arr1[1]=i;
                // System.out.println(nums[i]);
                break;
            }
        }
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(nums));
        if(arr1[0]==0&&arr1[1]==0)
        return 0;
        return Math.abs(arr1[0]-arr1[1])+1;
    }
}
