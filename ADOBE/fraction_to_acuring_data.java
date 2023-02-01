package ADOBE;
import java.util.*;
public class fraction_to_acuring_data {
    public String fractionToDecimal(int numerator, int denominator) {
        double res=(double) numerator/(double)denominator;
        String r=res+"";
        String store="";
        for(int i=0;i<r.length();i++)
        {
            
            if(r.charAt(i)=='.')
            {
                boolean flag=false;
                String st="";
                for(int j=i+1;j<r.length();j++)
                {
                    st+=r.charAt(j)+"";
                    if(r.charAt(j)!=0)
                    {
                        System.out.println(r);
                        flag=true;
                    }
                }
                if(flag==true)
                {
                    System.out.println(flag);
                    return store+"."+st;
                }
                break;
            }
            else
            {
                store+=r.charAt(i)+"";
            }
        }
        return store+"";
    }
}
