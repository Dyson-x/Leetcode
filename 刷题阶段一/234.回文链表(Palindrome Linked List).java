������뷨
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        int len=0;
        ListNode cur=null,tmp=head;
        while(tmp!=null){
            ListNode newNode=new ListNode(tmp.val);
            if(tmp==head){
                cur=newNode;
            }else{
                newNode.next=cur;
                cur=newNode;
            }
            ++len;
            tmp=tmp.next;
        }
        len/=2;
        while(len>0&&cur!=null&&head!=null){
            if(cur.val!=head.val){
                return false;
            }
            cur=cur.next;
            head=head.next;
            --len;
        }
        return true;
    }
}

ʹ�ÿ���ָ�������ٿռ俪��
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        int len=0;
        ListNode cur=null,tmp=head;
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            ListNode newNode=new ListNode(slow.val);
            if(cur==null){
                cur=newNode;
            }else{
                newNode.next=cur;
                cur=newNode;
            }
            slow=slow.next;
        }
        while(cur!=null){
            if(cur.val!=head.val){
                return false;
            }
            cur=cur.next;
            head=head.next;
        }
        return true;
    }
}

�������µĿռ�
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        //ע���,����fast�ĸ�ֵ
        ListNode fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tmp=slow.next;
        ListNode newhead=null;
        slow.next=null;
        //���ú�������
        while(tmp!=null){
            ListNode cur=tmp.next;
            tmp.next=newhead;
            newhead=tmp;
            tmp=cur;
        }
        while(newhead!=null){
            if(newhead.val!=head.val){
                return false;
            }
            newhead=newhead.next;
            head=head.next;
        }
        return true;
    }
}