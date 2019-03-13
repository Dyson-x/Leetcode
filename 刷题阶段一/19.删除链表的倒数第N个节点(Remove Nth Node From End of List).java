
����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣

ʾ����
����һ������: 1->2->3->4->5, �� n = 2.

��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.
˵����

������ n ��֤����Ч�ġ�

���ף�

���ܳ���ʹ��һ��ɨ��ʵ����

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        while(n!=0){
            n--;
            fast=fast.next;
        }
        ListNode slow=head;
        ListNode cur=slow;
        while(fast!=null){
            cur=slow;
            fast=fast.next;
            slow=slow.next;
        }
        if(slow==head){
            head=head.next;
        }else{
            cur.next=slow.next;
        }
        return head;
    }
}


ʹ��ͷ���ķ�ʽ����ɾ������ͷ�ͺ���ڵ�Ĵ���ʽͳһ��
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead=new ListNode(0);
        newhead.next=head;
        ListNode fast=newhead;
        ListNode slow=newhead;
        ListNode cur=newhead;
        while(n!=0||fast!=null){
            if(n!=0){
                fast=fast.next;
                --n;
            }else{
                cur=slow;
                fast=fast.next;
                slow=slow.next;
            }
        }
        cur.next=slow.next;
        return newhead.next;
    }
}


