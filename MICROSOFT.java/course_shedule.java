import java.util.*;
public class course_shedule {
    public boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<Integer>[] G = new ArrayList[n];
        int[] degree = new int[n];
        for (int i = 0; i < n; ++i) G[i] = new ArrayList<Integer>();
        for (int[] e : prerequisites) {
            G[e[0]].add(e[1]);
            degree[e[1]]++;
        }

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        for(int i:degree){
            bfs.add(i);
        }
        
        for(int i=0;i<bfs.size();i++){
            if(bfs.indexOf(0)==-1) 
            return false;
            int a=bfs.indexOf(0);
            bfs.set(a,-1);
            for(int j:G[a]){
                bfs.set(j,bfs.get(j)-1);
            }
        }
        return true;
    }
}
