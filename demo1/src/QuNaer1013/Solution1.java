package QuNaer1013;


public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param paths int整型二维数组 二维矩阵代表的雪球从山顶到山脚路径
     * @return int整型
     */
    public int minPath (int[][] paths) {
        int m = paths.length;
        int n = paths[0].length;
        int [][]dp = new int[m][n];
        dp[0][0] = paths[0][0];
        for(int i = 1 ;i < m ;i ++){
            dp[i][0] = dp[i-1][0] + paths[i][0];
        }
        for(int j = 1; j < n;j ++){
            dp[0][j] = dp[0][j-1] + paths[0][j];
        }
        for(int i = 1 ;i < m ;i++){
            for(int j = 1;j < n;j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + paths[i][j];
            }
        }

        return dp[m-1][n-1];
    }
}
