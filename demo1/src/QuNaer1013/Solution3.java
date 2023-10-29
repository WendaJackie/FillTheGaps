package QuNaer1013;


public class Solution3 {
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
        for(int i = a; i <= b; i++){
            dp[N][i] = 1.0;
        }
        for(int i = N ;i >= 1; i--){
            for(int j = a-1; j >= 0 ;j--){
                double ProWin = 0.0;
                double ProLose = 0.0;
                for(int k = 1; k <= N; k++){
                    // if(k != j){
                    //     if( i + k < a) {
                    //         Win += dp[k][Math.min(a-1, b)];
                    //     } else if (i + k >= a && i + k < b) {
                    //         Win += dp[k][b];
                    //     } else {
                    //         Lose += dp[k][b];                    //     }
                    // }
                    if( j + k >= a && j + k < b){
                        ProWin += dp[Math.min(N, k + i)][b];
                    } else {
                        ProWin += dp[Math.min(N, k + i)][j + k];
                    }
                }
                dp[j][i] = ProWin / N;;
            }
        }
        return dp[1][0];
    }
}