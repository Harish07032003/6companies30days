package FLIPKART;

public class Custom_Sort_String {
    public String customSortString(String order, String s) {
        HashMap<String,Integer> map=new HashMap<>();
        String S[]=s.split("");
        boolean flag=true;
        int count=0;
        String val="";
        String bal="";
        for(int i=0;i<order.length();i++)
        {
            for(int j=0;j<S.length;j++)
            {
                if((order.charAt(i)+"").equals(S[j]))
                {
                    val+=order.charAt(i)+"";
                    S[j]="*";
                }
            }
        }
        for(int i=0;i<S.length;i++)
        {
            if(!S[i].equals("*"))
            {
                val+=S[i];
            }
        }
        return val;
    }
}
