����һ���������������������� ������

ʾ��:

����: [1,null,2,3]
   1
    \
     2
    /
   3

���: [1,3,2]
����: �ݹ��㷨�ܼ򵥣������ͨ�������㷨�����


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
            //��������������ջ
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            tmp=s.pop();
            a.add(tmp.val);
            //����Ϊ������
            root=tmp.right;
        }
        //��������
        return a;
    }
}