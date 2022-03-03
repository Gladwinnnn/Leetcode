// Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.

// Input: root1 = [2,1,4], root2 = [1,0,3]
// Output: [0,1,1,2,3,4]

// Input: root1 = [1,null,8], root2 = [8,1]
// Output: [1,1,8,8]

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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        insertIntoList(root1);
        insertIntoList(root2);
        
        Collections.sort(result);
        return result;
    }
    
    public void insertIntoList(TreeNode root) {
        if (root != null) {
            if (root.left != null) insertIntoList(root.left);
            result.add(root.val);
            if (root.right != null) insertIntoList(root.right);   
        }
    }
}