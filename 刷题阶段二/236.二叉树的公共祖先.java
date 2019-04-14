/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//采用分值思想，如果p或q就是根节点，表明根节点就是最近公共祖先，如果不是，那么就去左子树与右子树去找p，q，如果都在左子树表明最近公共祖先就在左树，然后递归进行查找，同理右子树一样，如果在左子树与右子树都分别找到了p或q则表明最近公共祖先就是根节点
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