package QuNaer1013;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 最长公共子序列逆序输出
     * @param string1 string字符串
     * @param string2 string字符串
     * @return string字符串
     */

    // 数组越界
    public String maxSubsequenceAndReverse (String string1, String string2) {
        int m = string1.length();
        int n = string2.length();
        int [][]dp = new int[m+1][n+1];
        for(int i = 0; i <= m ; i++){
            for(int j = 0; j <= n ; j++){
                if(i == 0 || j ==0){
                    dp[i][j] = 0;
                }
                else if(string1.charAt(i-1) == string2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int length = dp[m][n];
        int i = m;
        int j = n;
        char[] LongestString = new char[length];
        while( i > 0 && j > 0){
            if(string1.charAt(i-1) == string2.charAt(j-1)){
                LongestString[length-1] = string1.charAt(i-1);
                i--;
                j--;
                length--;
            } else if (dp[i-1][j] > dp[i][j-1]){
                i--;
            } else {
                j--;
            }
        }
        String longestString = new String(LongestString);
        return new StringBuilder(longestString).reverse().toString();
    }
}
