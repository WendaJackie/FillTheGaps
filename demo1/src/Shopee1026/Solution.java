package Shopee1026;

import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */


public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     * @param nodes TreeNode类
     * @return int整型一维数组
     */
    public int[] getMostGold(TreeNode nodes) {
        // write code here
        List<Integer> path = new ArrayList<>();
        List<Integer> bestPath = new ArrayList<>();
        int []maxGold = new int[1];
        findMaxGoldPath(nodes, path, bestPath, maxGold);
        int []result = new int[bestPath.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = bestPath.get(i);
        }
        return result;
    }

    // DFS，深度遍历
    private void findMaxGoldPath(TreeNode node, List<Integer> path, List<Integer> bestPath, int[] maxGold) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if(node.left == null && node.right == null){
            int currentGold = path.stream().mapToInt(Integer::intValue).sum();
            if(currentGold > maxGold[0]){
                maxGold[0] = currentGold;
                bestPath.clear();
                bestPath.addAll(path);
            }
        }
        findMaxGoldPath(node.left, path, bestPath, maxGold);
        findMaxGoldPath(node.right, path, bestPath, maxGold);
        path.remove(path.size() - 1);
    }
}
