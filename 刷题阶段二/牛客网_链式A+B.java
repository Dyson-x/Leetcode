import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode ret=new ListNode(-1);
        ListNode cur=ret;
        int cu=0;
        while(a!=null||b!=null||cu!=0){
            int aval=a!=null?a.val:0;
            int bval=b!=null?b.val:0;
            int num=aval+bval+cu;
            //int sum=num%10;
            //num=num/10;
            if(num>9){
                cur.next=new ListNode(num-10);
                cu=1;
            }else{
                cur.next=new ListNode(num);
                cu=0;
            }
            cur=cur.next;
            a=a!=null?a.next:null;
            b=b!=null?b.next:null;
        }
        return ret.next;
    }
}