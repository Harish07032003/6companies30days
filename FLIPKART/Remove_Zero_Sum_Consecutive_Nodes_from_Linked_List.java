package FLIPKART;
import java.util.*;
public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)
        return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head;
        int sum=0;
        while(cur!=null)
        {
            if(cur.val+sum==0)
            {
                dummy.next=cur.next;
            }
            sum+=cur.val;
            cur=cur.next;
        }
        if(dummy.next!=null)
        {
            dummy.next.next=removeZeroSumSublists(dummy.next.next);
        }
        return dummy.next;
        
    }
}
