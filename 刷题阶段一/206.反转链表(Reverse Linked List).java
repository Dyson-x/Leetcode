方法一：不开闭额外空间
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode frist=head;
        ListNode second=frist.next;
        ListNode third=second.next;
        while(second!=null){
            if(frist==head){
                frist.next=null;
                second.next=frist;
                frist=second;
                second=third;
            }else{
                second.next=frist;
                frist=second;
                second=third;
            }
            if(third!=null){
                third=third.next;
            }
        }
        return frist;
    }
}

方法二：使用额外空间
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode last=null;
        ListNode tmp=head;
        while(tmp!=null){
            ListNode newNode=new ListNode(tmp.val);
            if(tmp==head){
                last=newNode;
            }else{
                newNode.next=last;
                last=newNode;
            }
            tmp=tmp.next;
        }
        return last;
    }
}