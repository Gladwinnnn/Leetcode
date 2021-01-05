/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:

Input: root = []
Output: []

Example 3:

Input: root = [1]
Output: [1]

Example 4:


Input: root = [1,2]
Output: [1,2]

Example 5:


Input: root = [1,null,2]
Output: [1,2]
*/

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        insertIntoList(root, result);
        return result;
    }
    
    public void insertIntoList(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            if (root.left != null) {
                insertIntoList(root.left, result);
            }
            if (root.right != null) {
                insertIntoList(root.right, result);
            }
        }
    }
}