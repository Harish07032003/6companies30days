package ADOBE;
import java.util.*;
public class count_nodes_equal {
    private int count=0;
    public int[] subtree_order(TreeNode root){
        if(root==null){
            //total sum , total node 
            return new int[]{0,0};
        }
        int[] left=subtree_order(root.left);
        int[] right=subtree_order(root.right);
        int totalsum=left[0]+right[0]+root.val;
        int totalnode=left[1]+right[1]+1;
        if(totalsum/totalnode==root.val){
            count++;
        }
        return new int[]{totalsum,totalnode};
    }
    public int averageOfSubtree(TreeNode root) {
        if(root == null){
            return count;
        }
        subtree_order(root);
        return count;
    }
}
