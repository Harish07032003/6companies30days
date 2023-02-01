package FLIPKART;
import java.util.*;
public class Find_the_Winner_of_the_Circular_Game {
    public int findTheWinner(int n, int k) {
        if(n==1)
        {
        return 1;
        }
        else
        return (findTheWinner(n-1,k)+k-1)%n+1;
    }
}
