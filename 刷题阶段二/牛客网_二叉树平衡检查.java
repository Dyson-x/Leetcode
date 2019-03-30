import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        int left=judge(root.left);
        int right=judge(root.right);
        if(Math.abs(left-right)<=1){
            return isBalance(root.left)&&isBalance(root.right);
        }else{
            return false;
        }
    }
    public int judge(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int left=judge(root.left);
            int right=judge(root.right);
            return left>right?left+1:right+1;
        }
    }
}