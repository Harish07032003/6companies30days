import java.util.*;
public class number_of_boomerangs {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=0;j<points.length;j++)
            {
                if(i!=j)
                {
                    int x1=(int)Math.pow((points[i][0]-points[j][0]),2);
                    int y1=(int)Math.pow((points[i][1]-points[j][1]),2);
                    map.put(x1+y1,map.getOrDefault(x1+y1,0)+1);
                }
            }
            for(int h:map.values())
            {
                res+=h*(h-1);
            }
            map.clear();
        }
        return res;
    }
}
