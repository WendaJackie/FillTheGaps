package 美团校招真题;

import java.util.Scanner;

public class MaxSumWithMagic {
    public static int maxSumWithMagic(int[] nums) {
        int n = nums.length;

        // 初始化动态规划数组
        int[][] dp = new int[n + 1][n + 1];

        // 填充dp数组，dp[i][j]表示前i个数字中有j个乘号的最大和
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] + nums[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // 不使用魔法时，可以选择继续使用加号或者使用乘号
                dp[i][j] = Math.max(dp[i - 1][j] + nums[i - 1], dp[i - 1][j - 1] * nums[i - 1]);
            }
        }

        // 遍历所有可能的乘号数量，找到最大的和
        int maxSum = 0;
        for (int j = 0; j <= n; j++) {
            maxSum = Math.max(maxSum, dp[n][j]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入数字的个数
        System.out.print("请输入数字的个数: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // 提示用户输入每个数字
        for (int i = 0; i < n; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个数字: ");
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        int result = maxSumWithMagic(nums);
        System.out.println("最大的和是: " + result);
    }
}
