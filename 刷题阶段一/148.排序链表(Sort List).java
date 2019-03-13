在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。

示例 1:

输入: 4->2->1->3
输出: 1->2->3->4
示例 2:

输入: -1->5->3->4->0
输出: -1->0->3->4->5


采用分支归并思想，用快慢指针的方法寻找中间节点，然后不断分治归并
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