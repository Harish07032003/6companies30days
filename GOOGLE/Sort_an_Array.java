package GOOGLE;
import java.util.*;
public class Sort_an_Array {
    public int[] sortArray(int[] nums) {
        merge(nums);
        return nums;
    }
    void merge(int[] num)
    {
        if(num.length<2)
        return ;
        int mid=num.length/2;
        int left[]=new int[mid];
        int right[]=new int[num.length-mid];
        for(int i=0;i<mid;i++)
        {
            left[i]=num[i];
        }
        for(int i=mid;i<num.length;i++)
        {
            right[i-mid]=num[i];
        }
        merge(left);
        merge(right);
        mergesort(num,left,right);
    }
    void mergesort(int arr[],int leftarr[],int rightarr[])
    {
        int i=0,j=0,k=0;
        while(i<leftarr.length&&j<rightarr.length)
        {
            if(leftarr[i]>rightarr[j])
            {
                arr[k]=rightarr[j];
                j++;
            }
            else
            {
                arr[k]=leftarr[i];
                i++;
            }
            k++;
        }
        while(i<leftarr.length)
        {
            arr[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<rightarr.length)
        {
            arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
}
