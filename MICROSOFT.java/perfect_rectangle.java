import java.util.*;
public class perfect_rectangle {
    public boolean isRectangleCover(int[][] rectangles) {
        if(rectangles.length==0 || rectangles[0].length==0)
        {
            return false;
        } 
        int x1=Integer.MAX_VALUE;
        int x2=Integer.MIN_VALUE;
        int y1=Integer.MAX_VALUE;
        int y2=Integer.MIN_VALUE;
        HashSet<String> set=new HashSet<>();
        int area=0;
        for(int[] rect:rectangles)
        {
            x1=Math.min(rect[0],x1);
            y1=Math.min(rect[1],y1);
            x2=Math.max(rect[2],x2);
            y2=Math.max(rect[3],y2);
            area+=(rect[2]-rect[0])*(rect[3]-rect[1]);
        }
       if(area==(x2-x1)*(y2-y1))
        {
            return true;
        }
        return false;
     }
}
