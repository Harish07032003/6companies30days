import java.util.*;
public class valid_square {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a=0,b=0,c=0,d=0;
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int pnt1=dist(p1[0],p2[0],p1[1],p2[1]);
        set.add(pnt1);
        int pnt2=dist(p4[0],p3[0],p4[1],p3[1]);
        set.add(pnt2);
        int pnt3=dist(p3[0],p1[0],p3[1],p1[1]);
        set.add(pnt3);
        int pnt4=dist(p4[0],p1[0],p4[1],p1[1]);
        set.add(pnt4);
        int pnt5=dist(p3[0],p2[0],p3[1],p2[1]);
        set.add(pnt5);
        int pnt6=dist(p2[0],p4[0],p2[1],p4[1]);
        set.add(pnt6);
        System.out.println(set);
        if(set.size()==2 && !set.contains(0))
        {
            return true;
        }
        else
        return false;
    }
    static int dist(int a,int b,int c,int d)
    {
        return (int)Math.pow((b-a),2)+(int)Math.pow((d-c),2);
    }
}
