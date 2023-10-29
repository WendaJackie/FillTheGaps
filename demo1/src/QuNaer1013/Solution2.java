package QuNaer1013;


public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 动态规划实现
     * @param N int整型
     * @param a int整型
     * @param b int整型
     * @return double浮点型
     */
    public double percent (int N, int a, int b) {
        double[][] dp = new double[N+1][b+1];
        for(int i = 1; i <= N; i++){
            dp[i][a-1] = 1.0;
            dp[i][b] = 0.0;
        }
        for(int i = a-2 ;i >= 0; i--){
            for(int j = 1; j <= N ;j++){
                double Win = 0.0;
                double Lose = 0.0;
                for(int k = 1; k <= N; k++){
                    if(k != j){
                        if( i + k < a) {
                            Win += dp[k][Math.min(a-1, b)];
                        } else if (i + k >= a && i + k < b) {
                            Win += dp[k][b];
                        } else {
                            Lose += dp[k][b];
                        }
                    }
                }
                dp[j][i] = Win / (N - 1 - Lose);
                double m = dp[j][i];
            }
        }
        return dp[1][0];
    }
}
