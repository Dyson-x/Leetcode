/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode tmp=head;
        //计算链表长度
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        len/=k;
        //当没有要反转链表的时候直接返回
        if(len==0)
            return head;
        ListNode cur=head;
        ListNode tail=cur;
        for(int i=0;i<len;i++){
            //newlist表示分离出来的链表
            ListNode newlist=null;
            //newhead表示分离出来链表的头
            ListNode newhead=cur;
            int count=k;
            //反转分离出来的链表
            while(count>0){
                tmp=cur;
                cur=cur.next;
                tmp.next=newlist;
                newlist=tmp;
                count--;
            }
            //只有当第一次反转链表时不用将首尾相连，因为只有头，所以只需要将链表原本的头
            //更新即可，在后面的链表反转中，则需要将分离出来的链表与之前的链表首尾相连
            if(i==0){
                head=newlist;
            }else{
                tail.next=newlist;
                tail=newhead;
            }
        }
        //链接链表剩余的部分
        while(cur!=null){
            tail.next=cur;
            tail=tail.next;
            cur=cur.next;
        }
        //返回头节点
        return head;
    }
}