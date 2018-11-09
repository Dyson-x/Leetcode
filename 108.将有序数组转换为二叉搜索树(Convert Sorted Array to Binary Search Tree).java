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
    public TreeNode sortedArrayToBST(int[] nums) {
        return addNode(nums,0,nums.length-1);
    }
    public TreeNode addNode(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        //这里注意运算符优先级问题
        int mid=left+((right-left)>>1);
        TreeNode ret=new TreeNode(nums[mid]);
        //创建左子树
        ret.left=addNode(nums,left,mid-1);
        //创建右子树
        ret.right=addNode(nums,mid+1,right);
        //返回根节点
        return ret;
    }
}