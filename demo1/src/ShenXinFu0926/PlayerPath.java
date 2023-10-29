package ShenXinFu0926;

/**
 * 一个游戏玩家有K点体力，在一个m乘n的长格中，k,m,n均为正整数，玩家位于(0,0)，需要到达(m,n)，玩家只能上下左右移动，且每次只能移动1的长度并且消耗1的体力，当体力耗尽后玩家无法移动，
 * 给定k m n问玩家能否到终点，如果可以，给出最短路径的走法，如果不能，输出0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerPath {

    public static List<String> findShortestPath(int k, int m, int n) {
        List<String> path = new ArrayList<>();
        boolean[][] visited = new boolean[m + 1][n + 1];

        if (dfs(0, 0, k, m, n, visited, path)) {
            return path;
        } else {
            return new ArrayList<>();
        }
    }

    private static boolean dfs(int x, int y, int k, int m, int n, boolean[][] visited, List<String> path) {
        // 判断是否越界或已经访问过
        if (x < 0 || x > m || y < 0 || y > n || visited[x][y]) {
            return false;
        }

        // 到达终点
        if (x == m && y == n) {
            path.add("(" + x + "," + y + ")");
            return true;
        }

        // 判断是否有足够的体力进行移动
        if (k <= 0) {
            return false;
        }

        visited[x][y] = true;

        // 向上移动
        if (dfs(x - 1, y, k - 1, m, n, visited, path)) {
            path.add("(" + x + "," + y + ")");
            return true;
        }

        // 向下移动
        if (dfs(x + 1, y, k - 1, m, n, visited, path)) {
            path.add("(" + x + "," + y + ")");
            return true;
        }

        // 向左移动
        if (dfs(x, y - 1, k - 1, m, n, visited, path)) {
            path.add("(" + x + "," + y + ")");
            return true;
        }

        // 向右移动
        if (dfs(x, y + 1, k - 1, m, n, visited, path)) {
            path.add("(" + x + "," + y + ")");
            return true;
        }

        visited[x][y] = false;
        return false;
    }

    public static void main(String[] args) {
//        int k = 10; // 体力
//        int m = 4;  // 行数
//        int n = 4;  // 列数
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        List<String> path = findShortestPath(k, m, n);
        if (path.isEmpty()) {
            System.out.println("无法到达终点");
        } else {
            System.out.println("最短路径：" + path);
        }
    }
}
