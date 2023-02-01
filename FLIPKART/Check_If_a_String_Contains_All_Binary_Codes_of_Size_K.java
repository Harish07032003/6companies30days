package FLIPKART;

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {
    public boolean hasAllCodes(String s, int k) {
        String bin="";
        int n=s.length()/k;
        for(int i=0;i<n;i++)
        {
            bin=Integer.toBinaryString(i);
            // System.out.println("binnotchange="+bin);
            if(bin.length()<k)
            {
                int h=k-bin.length();
                // System.out.println("len="+bin.length()+"-"+k+"="+h);
                for(int j=0;j<h;j++)
                {
                    bin+="0";
                }
            }
            if(bin.length()<=k)
            {
                if(!s.contains(bin))
                {
                    return false;
                }
            }
            // System.out.println(bin);
        }
        System.out.println(n);
        if(s.length()<k)
        {
            return false;
        }
        return true;
    }
}
