删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) 
            return null;
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        ListNode cur=newhead;
        ListNode del=head;
        while(del!=null){
            if(del.val==val){
                cur.next=del.next;
                del=cur.next;
            }else{
                del=del.next;
                cur=cur.next;
            }
        }
        return newhead.next;
    }
}