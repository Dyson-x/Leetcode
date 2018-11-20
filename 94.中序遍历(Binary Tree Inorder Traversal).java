给定一个二叉树，返回它的中序 遍历。

示例:

输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？


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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>(); 
        Stack<TreeNode> s=new Stack<TreeNode>();
        Integer cur;
        TreeNode tmp=null;
        while(root!=null||!s.isEmpty()){
            //将左子树依次入栈
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            tmp=s.pop();
            a.add(tmp.val);
            //更换为右子树
            root=tmp.right;
        }
        //返回数组
        return a;
    }
}