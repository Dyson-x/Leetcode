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
        //��¼���������ͷ���
        ListNode head=ret;
        int cur=0;
        do{
            //����λ��֮��
            int num=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+cur;
            //��������
            int digit=num%10;
            //�����λ
            cur=num/10;
            ret.val=digit;
            //����l1��l2����
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
            //�ж��Ƿ���Ҫ����½ڵ�
            if(l1!=null||l2!=null||cur!=0){
                ret.next=new ListNode(0);
                ret=ret.next;
            }
        //����������Ϊ�ջ��߻����ڽ�λʱ��ѭ������
        }while(l1!=null||l2!=null||cur!=0);
        //����ͷ���
        return head;
    }
}  
