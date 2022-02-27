// Given the root of a binary tree, return the inorder traversal of its nodes' values.

// Input: root = [1,null,2,3]
// Output: [1,3,2]

// Input: root = []
// Output: []

// Input: root = [1]
// Output: [1]

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
    ArrayList<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        
        if (root.left != null) inorderTraversal(root.left);
        result.add(root.val);
        if (root.right != null) inorderTraversal(root.right);
        
        return result;
    }
}