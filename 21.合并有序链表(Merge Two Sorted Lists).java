/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret=new ListNode(0);
        ListNode head=ret;
        //若l1和l2都为空，直接返回null
        if(l1==null&&l2==null){
            return null;
        }
        //若两个节点都为空时，循环结束
        while(l1!=null||l2!=null){
            //如果l1不为空，l2为空或者l2的值大于l1则连接l1该节点
            if(l1!=null&&(l2==null||l2.val>l1.val)){
                ret.next=l1;
                l1=l1.next;
            }else{  //l2不为空，l1为空或者l1的值大于l2则连接l2该节点
                ret.next=l2;
                l2=l2.next;
            }
            //更新ret
            ret=ret.next;
        //返回所记录的头节点
        return head.next;
    }
}