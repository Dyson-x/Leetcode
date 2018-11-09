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
        //��l1��l2��Ϊ�գ�ֱ�ӷ���null
        if(l1==null&&l2==null){
            return null;
        }
        //�������ڵ㶼Ϊ��ʱ��ѭ������
        while(l1!=null||l2!=null){
            //���l1��Ϊ�գ�l2Ϊ�ջ���l2��ֵ����l1������l1�ýڵ�
            if(l1!=null&&(l2==null||l2.val>l1.val)){
                ret.next=l1;
                l1=l1.next;
            }else{  //l2��Ϊ�գ�l1Ϊ�ջ���l1��ֵ����l2������l2�ýڵ�
                ret.next=l2;
                l2=l2.next;
            }
            //����ret
            ret=ret.next;
        //��������¼��ͷ�ڵ�
        return head.next;
    }
}