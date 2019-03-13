��дһ�������ҵ������������ཻ����ʼ�ڵ㡣

���磬�������������

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
�ڽڵ� c1 ��ʼ�ཻ��



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0,len2=0;
        ListNode tmp1=headA,tmp2=headB;
        while(tmp1!=null||tmp2!=null){
            if(tmp1!=null){
                tmp1=tmp1.next;
                len1++;
            }
            if(tmp2!=null){
                tmp2=tmp2.next;
                len2++;
            }
        }
        tmp1=headA;tmp2=headB;
        while(tmp1!=null&&tmp2!=null&&tmp1!=tmp2){
            if(len1>len2){
                tmp1=tmp1.next;
                len1--;
            }else if(len1<len2){
                tmp2=tmp2.next;
                len2--;
            }else{
                tmp1=tmp1.next;
                tmp2=tmp2.next;
            }
        }
        if(tmp1==tmp2)
            return tmp1;
        return null;
    }
}


�������淨��
A:           a1 �� a2
                         �K
                          c1 �� c2 �� c3
                         �J            
B:  b1 �� b2 �� b3

������Ϳ��Կ���ѭ��������������
Ҫô�������������� 
Ҫô���˽�������������ָ��յ�ʱ��
a1  a2  c1  c2  c3 null  b1  b2  b3  c1  c2  c3  null
b1  b2 b3  c1  c2  c3  null  a1  a2  c1  c2  c3  null
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode tmp1=headA,tmp2=headB;
        while(tmp1!=tmp2){
            tmp1=tmp1==null?headB:tmp1.next;
            tmp2=tmp2==null?headA:tmp2.next;
        }
        return tmp1;
    }
}













