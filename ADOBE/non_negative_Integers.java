package ADOBE;
import java.util.*;
public class non_negative_Integers {
    int count=2;
    public int findIntegers(int n) {
        find(1,1,n);
        return count;
    }
    public int find(int prev,int num,int n)
    {
        if(num*2<=n)
        {
            count++;
            find(0,num*2,n);
        }
        if(prev==0 && num*2+1<=n)
        {
            count++;
            find(1,num*2+1,n);
        }
        return count;
    }
}
