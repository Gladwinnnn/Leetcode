// Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, 
// and every node has no left child and only one right child.

// Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
// Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

// Input: root = [5,1,7]
// Output: [1,null,5,null,7]

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
    ArrayList<Integer> placeHolder = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if (root.left != null) increasingBST(root.left);
        placeHolder.add(root.val);
        if (root.right != null) increasingBST(root.right);
        
        TreeNode tempResult = new TreeNode(placeHolder.get(0));
        TreeNode result = tempResult;
        
        for (int i = 1; i < placeHolder.size(); i++) {
            TreeNode temp = new TreeNode(placeHolder.get(i));
            tempResult.left = null;
            tempResult.right = temp;
            
            tempResult = tempResult.right;
        }
        
        return result;
    }
}