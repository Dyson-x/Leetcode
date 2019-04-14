/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//���÷�ֵ˼�룬���p��q���Ǹ��ڵ㣬�������ڵ��������������ȣ�������ǣ���ô��ȥ��������������ȥ��p��q�����������������������������Ⱦ���������Ȼ��ݹ���в��ң�ͬ��������һ��������������������������ֱ��ҵ���p��q���������������Ⱦ��Ǹ��ڵ�
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||p==root||q==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        return left==null?right:right==null?left:root;
    }
}