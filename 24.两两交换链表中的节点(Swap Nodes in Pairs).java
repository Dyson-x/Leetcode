/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node1=head;
        ListNode node2=head.next;
        ListNode tmp=head;
        while(node2!=null){
            //如果要交换的节点为头结点，那么交换之后将head更新
            if(node1==head){
                node1.next=node2.next;
                node2.next=node1;
                head=node2;
            }else{
                node1.next=node2.next;
                node2.next=node1;
                tmp.next=node2;
            }
            tmp=node1;
            node1=node1.next;
            if(node1!=null){
                node2=node1.next;
            }else{
                node2=node1;
            }
        }
        return head;
    }
}