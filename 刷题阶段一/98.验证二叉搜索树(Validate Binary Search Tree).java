采用中序遍历的方法
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
        //中序遍历,二叉搜索树是一个递增的序列
        while(p!=null||!s.empty()){
            while(p!=null){
                s.push(p);
                p=p.left;
            }
            TreeNode tmp=s.pop();
            //判断是否满足递增序列，如果不满足，直接返回false
            if(cur!=null&& tmp.val<=cur.val){
                return false;
            }
            cur=tmp;
            p=tmp.right;
        }
        return true;
    }
}


解法二（不是很明白）
利用其本身性质来做，初始化时带入系统最大值和最小值，
在递归过程中换成它们自己的节点值，用long代替int就是为了包括int的边界条件，

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