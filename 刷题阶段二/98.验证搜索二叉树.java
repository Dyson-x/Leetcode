/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//���õݹ�˼�룬ͨ�������������ֵ��ͨ������������Сֵ��Ȼ��ͬ�������ֵ����Сֵ�ıȽ��жϵ�ǰ�ڵ��Ƿ�������������������ʣ���ȥ���ϵݹ�
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return judge(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean judge(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val<=min) return false;
        if(root.val>=max) return false;
        return judge(root.left,min,root.val)&&judge(root.right,root.val,max);
    }
}