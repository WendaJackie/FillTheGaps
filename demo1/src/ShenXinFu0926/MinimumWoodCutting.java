package ShenXinFu0926;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 有一批长度不同的木材，需要将木材进行拼接，达到总长度length，在不考虑切割木材，并且每种长度的木材不限量供应的情况下，
 * 返回满足要求的最少木材数据，无法组合达到规定长度返回-1。
 * 输入一个数组，表示一批木材，再输入总长度length，
 * 输出最少木材数量
 */
public class MinimumWoodCutting {

    public static int minWoodCutting(int[] woods, int length) {
        int n = woods.length;

        // dp[i]表示达到长度i所需的最小木材数量
        int[] dp = new int[length + 1];

        // 初始化dp数组
        for (int i = 1; i <= length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // 遍历每种长度的木材
        for (int wood : woods) {
            // 更新dp数组
            for (int i = wood; i <= length; i++) {
                if (i - wood >= 0 && dp[i - wood] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - wood] + 1);
                }
            }
        }

        // 如果无法达到所需长度，返回-1
        if (dp[length] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[length];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入木材数组：");
        String input = scanner.nextLine();

        // 使用正则表达式提取数组中的整数
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int[] woods = new int[100]; // 假设最多100个数字
        int count = 0;

        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            woods[count++] = num;
        }

        System.out.print("请输入总长度：");
        int length = scanner.nextInt();

        int minCut = minWoodCutting(woods, length);
        System.out.println("最少木材数量: " + minCut);
    }
}
