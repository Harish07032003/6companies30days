import java.util.*;
public class Number_of_Substrings_Containing_All_Three_Character {
    public int numberOfSubstrings(String s) {
        int freq[]=new int[3];
        int j=0;
        int res=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            while(freq[0]!=0 && freq[1]!=0 && freq[2]!=0)
            {
                freq[s.charAt(j)-'a']--;
                j++;
                count++;
            }
            res+=count;
        }
        return res;

    }
}