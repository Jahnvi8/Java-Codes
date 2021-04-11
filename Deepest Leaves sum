/*  Given the root of a binary tree, return the sum of values of its deepest leaves.
Example 1:
Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15

Example 2:
Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 19
 
Constraints:
The number of nodes in the tree is in the range [1, 104].
1 <= Node.val <= 100   */
___________________________________________________________________________________________

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Main {
    public int deepestLeavesSum(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int s=0;
        while(!q.isEmpty())
        {
            s=0;
            int size=q.size();
            
            while(size-- > 0)
            {
                TreeNode head=q.poll();
                s+=head.val;
                if(head.left!=null) q.offer(head.left);
                if(head.right!=null) q.offer(head.right);
                
            }
        }
        return s;
    }
}
