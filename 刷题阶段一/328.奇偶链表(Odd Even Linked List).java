����һ�������������е������ڵ��ż���ڵ�ֱ�����һ����ע�⣬
����������ڵ��ż���ڵ�ָ���ǽڵ��ŵ���ż�ԣ������ǽڵ��ֵ����ż�ԡ�

�볢��ʹ��ԭ���㷨��ɡ�����㷨�Ŀռ临�Ӷ�ӦΪ O(1)��ʱ�临�Ӷ�ӦΪ
 O(nodes)��nodes Ϊ�ڵ�������

ʾ�� 1:

����: 1->2->3->4->5->NULL
���: 1->3->5->2->4->NULL
ʾ�� 2:

����: 2->1->3->5->6->4->7->NULL 
���: 2->3->6->7->1->5->4->NULL
˵��:

Ӧ�����������ڵ��ż���ڵ�����˳��
����ĵ�һ���ڵ���Ϊ�����ڵ㣬�ڶ����ڵ���Ϊż���ڵ㣬�Դ����ơ�

��ԭ������ֳ�������������ڽ���ϲ���������

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode a=head,b=head.next;
        ListNode newhead=b,cur=a;
        while(a!=null&&b!=null){
            if(b!=null){
                a.next=b.next;
                cur=a;
                a=a.next;
            }else
                a.next=null;
            if(a!=null){
                b.next=a.next;
                b=b.next;
            }else
                b.next=null;
        }
        if(a==null) 
            cur.next=newhead;
        else    
            a.next=newhead;
        return head;
    }
}