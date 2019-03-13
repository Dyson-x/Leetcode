
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：
给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。

进阶：

你能尝试使用一趟扫描实现吗？

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


使用头结点的方式，将删除链表头和后面节点的处理方式统一化
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


