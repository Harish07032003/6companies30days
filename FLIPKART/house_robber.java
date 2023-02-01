package FLIPKART;

public class house_robber {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] tab=new int[n+1];
        tab[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            tab[i]=Math.max(tab[i+1], nums[i]+tab[i+2]);
            System.out.println(Arrays.toString(tab));
        }
        return tab[0];
    }
}
