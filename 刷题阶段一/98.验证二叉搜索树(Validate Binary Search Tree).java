������������ķ���
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode p=root,cur=null;
        //�������,������������һ������������
        while(p!=null||!s.empty()){
            while(p!=null){
                s.push(p);
                p=p.left;
            }
            TreeNode tmp=s.pop();
            //�ж��Ƿ�����������У���������㣬ֱ�ӷ���false
            if(cur!=null&& tmp.val<=cur.val){
                return false;
            }
            cur=tmp;
            p=tmp.right;
        }
        return true;
    }
}


�ⷨ�������Ǻ����ף�
�����䱾��������������ʼ��ʱ����ϵͳ���ֵ����Сֵ��
�ڵݹ�����л��������Լ��Ľڵ�ֵ����long����int����Ϊ�˰���int�ı߽�������

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return Adjust(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean Adjust(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min||root.val>=max){
            return false;
        }
        return                                                  Adjust(root.left,min,root.val)&&Adjust(root.right,root.val,max);
    }
}