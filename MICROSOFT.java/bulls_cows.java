import java.util.*;
public class bulls_cows {
    public String getHint(String secret, String guess) {
        int arr[]=new int[10];
        int bull=0,cow=0;
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                bull++;
            }
            arr[Integer.parseInt(secret.charAt(i)+"")]++;
        }
        for(int i=0;i<guess.length();i++)
        {
            if(arr[Integer.parseInt(guess.charAt(i)+"")]!=0)
            {
                cow++;
            arr[Integer.parseInt(guess.charAt(i)+"")]--;
            }
            
        }
        int ans=cow-bull;
        return bull+"A"+ans+"B";
    }
}
