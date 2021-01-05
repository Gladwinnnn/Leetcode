/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:

Input: root = []
Output: []

Example 3:

Input: root = [1]
Output: [1]

Example 4:


Input: root = [1,2]
Output: [2,1]

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
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) { 
        List<Integer> result = new ArrayList<>();
        insertIntoList(root, result);
        return result;
    }
    
    public void insertIntoList(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                insertIntoList(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                insertIntoList(root.right, result);
            }
        }
    }
}