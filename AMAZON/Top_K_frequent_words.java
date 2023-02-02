package AMAZON;
import java.util.*;
public class Top_K_frequent_words {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> set=new HashMap<>();
        
        for(int i=0;i<words.length;i++)
        {
            if(!set.containsKey(words[i]))
            {
                set.put(words[i],1);
            }
            else
            {
                set.put(words[i],set.get(words[i])+1);
            }
        }
        ArrayList<Integer> str=new ArrayList<>(set.values());
        ArrayList<String>keys=new ArrayList<>(set.keySet());
        
        ArrayList<String>res=new ArrayList<>();
        Collections.sort(str);
         Collections.reverse(str);
        for(int i=0;i<str.size();i++)
        {
            ArrayList<String>temp=new ArrayList<>();
            for(int j=0;j<str.size();j++)
            {
                if(set.get(keys.get(j))==str.get(i))
                {
                    temp.add(keys.get(j));
                    set.put(keys.get(j),-1);
                }
            }
            Collections.sort(temp);
            res.addAll(temp);
            
        }
        keys.clear();
        for(int i=0;i<k;i++)
        {
            keys.add(res.get(i));
        }
        
        return keys;
    }
}
