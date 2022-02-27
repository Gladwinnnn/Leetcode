// Given the root of a binary tree, return the postorder traversal of its nodes' values.

// Input: root = [1,null,2,3]
// Output: [3,2,1]

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
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return result;
        
        if (root.left != null) postorderTraversal(root.left);
        if (root.right != null) postorderTraversal(root.right);
        result.add(root.val);
        
        return result;
    }
}