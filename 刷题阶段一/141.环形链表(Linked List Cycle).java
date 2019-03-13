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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        do{
            if(fast.next==null){
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
        }while((slow!=fast)&&fast!=null);
        if(slow==fast){
            return true;
        }
        return false;
    }
}