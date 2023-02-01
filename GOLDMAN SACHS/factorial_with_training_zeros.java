import java.util.*;
public class factorial_with_training_zeros {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5)
        {
            n=n/5;
            count+=n;
        }
        return count;
    }
}
