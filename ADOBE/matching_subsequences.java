package ADOBE;
import java.util.*;
public class matching_subsequences {
    public int numMatchingSubseq(String s, String[] words) {
        int a=0;
        int res=0;
        while(a<words.length)
        {
            String arr[]=s.split("");
            String st=words[a];
            int count=0;
            for(int i=0;i<st.length();i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    if((st.charAt(i)+"").equals(arr[j]))
                    {
                        arr[j]="*";
                        count++;
                        // System.out.println(st+","+count+"-"+Arrays.toString(arr));
                        break;
                    }
                }
            }
            if(count==st.length())
            {
                // System.out.println(st+","+res);
                res++;
            }
            a++;
        }
        
        return res;
    }
}
