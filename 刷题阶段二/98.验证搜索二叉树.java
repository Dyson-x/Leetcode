/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//采用递归思想，通过左子树找最大值，通过右子树找最小值，然后同过和最大值与最小值的比较判断当前节点是否满足二叉搜索数的性质，再去不断递归
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