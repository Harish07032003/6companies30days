package FLIPKART;
import java.util.*;
public class Shopping_Offers {
    int n;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        n = price.size();
        return helper(price, special, needs, 0);
    }

    private int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int i) {
        if (i == special.size()) {
            int res = 0;
            for (int j = 0; j < n; j++) {
                res += price.get(j) * needs.get(j);
            }
            return res;
        }
        List<Integer> needs1 = new ArrayList<>();
        if (!check(special.get(i), needs)) {
            return helper(price, special, needs, i + 1);
        }
        for (int k = 0; k < n; k++) {
            needs1.add(k, needs.get(k) - special.get(i).get(k));
        }
        return Math.min(helper(price, special, needs1, i) + special.get(i).get(n),
                helper(price, special, needs, i + 1));
    }

    private boolean check(List<Integer> list, List<Integer> needs) {
        for (int i = 0; i < n; i++) {
            if (list.get(i) > needs.get(i))
                return false;
        }
        return true;
    }
}
