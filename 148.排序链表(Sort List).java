�� O(n log n) ʱ�临�ӶȺͳ������ռ临�Ӷ��£��������������

ʾ�� 1:

����: 4->2->1->3
���: 1->2->3->4
ʾ�� 2:

����: -1->5->3->4->0
���: -1->0->3->4->5


���÷�֧�鲢˼�룬�ÿ���ָ��ķ���Ѱ���м�ڵ㣬Ȼ�󲻶Ϸ��ι鲢
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode tmp=head,slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            tmp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        tmp.next=null;
        return marge(sortList(head),sortList(slow));
    }
    public ListNode marge(ListNode l1,ListNode l2){
        if(l1==null)    return l2;
    
        if(l2==null)    return l1;
        if(l1.val<l2.val){
            l1.next=marge(l1.next,l2);
            return l1;
        }else{
            l2.next=marge(l1,l2.next);
            return l2;
        }
    }
}