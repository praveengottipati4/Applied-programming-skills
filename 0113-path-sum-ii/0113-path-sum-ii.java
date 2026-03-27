import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;

        // add current node
        path.add(node.val);

        // check if leaf node
        if (node.left == null && node.right == null && target == node.val) {
            result.add(new ArrayList<>(path));
        } else {
            // traverse left & right
            dfs(node.left, target - node.val, path, result);
            dfs(node.right, target - node.val, path, result);
        }

        // backtrack
        path.remove(path.size() - 1);
    }
}