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
        //����������
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        len/=k;
        //��û��Ҫ��ת�����ʱ��ֱ�ӷ���
        if(len==0)
            return head;
        ListNode cur=head;
        ListNode tail=cur;
        for(int i=0;i<len;i++){
            //newlist��ʾ�������������
            ListNode newlist=null;
            //newhead��ʾ������������ͷ
            ListNode newhead=cur;
            int count=k;
            //��ת�������������
            while(count>0){
                tmp=cur;
                cur=cur.next;
                tmp.next=newlist;
                newlist=tmp;
                count--;
            }
            //ֻ�е���һ�η�ת����ʱ���ý���β��������Ϊֻ��ͷ������ֻ��Ҫ������ԭ����ͷ
            //���¼��ɣ��ں��������ת�У�����Ҫ�����������������֮ǰ��������β����
            if(i==0){
                head=newlist;
            }else{
                tail.next=newlist;
                tail=newhead;
            }
        }
        //��������ʣ��Ĳ���
        while(cur!=null){
            tail.next=cur;
            tail=tail.next;
            cur=cur.next;
        }
        //����ͷ�ڵ�
        return head;
    }
}