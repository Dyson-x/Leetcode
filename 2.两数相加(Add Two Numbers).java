/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret=new ListNode(0);
        //记录返回链表的头结点
        ListNode head=ret;
        int cur=0;
        do{
            //计算位数之和
            int num=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+cur;
            //计算余数
            int digit=num%10;
            //计算进位
            cur=num/10;
            ret.val=digit;
            //更新l1和l2链表
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
            //判断是否需要添加新节点
            if(l1!=null||l2!=null||cur!=0){
                ret.next=new ListNode(0);
                ret=ret.next;
            }
        //当两个链表不为空或者还存在进位时，循环继续
        }while(l1!=null||l2!=null||cur!=0);
        //返回头结点
        return head;
    }
}  
