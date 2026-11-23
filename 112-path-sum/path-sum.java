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

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        // Base case: empty tree
        if(root == null) {
            return false;
        }

        // Check if current node is a leaf
        if(root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Subtract current node's value
        int remaining = targetSum - root.val;

        // Check either subtree
        return hasPathSum(root.left, remaining)
            || hasPathSum(root.right, remaining);
    }
}
