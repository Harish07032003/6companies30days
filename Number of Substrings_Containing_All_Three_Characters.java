import java.util.*;
class numberofsubstrings {
    public static int numberOfSubstrings(String s) {
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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(numberOfSubstrings(n));
    }
    
}