/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast,slow,node;
        fast=slow=head;
        do{
            if(fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(fast!=slow&&fast!=null);
        if(fast==null){
            return null;
        }else{
            node=head;
            while(fast!=node){
                fast=fast.next;
                node=node.next;
            }
            return node;
        }
    }
}


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast,slow,node;
        node=fast=slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                while(fast!=node){
                    fast=fast.next;
                    node=node.next;
                }
                return node;
            }
        }
        return null;
    }
}