package ShenXinFu0926;

import java.util.Scanner;

public class LongestDecreasingSubsequence {

    public static int findLongestDecreasingSubsequence(int[] nums) {
        int longestLength = 0;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入逗号分隔的整数数组：");
        String input = scanner.nextLine();
        String[] numStrings = input.split(",");

        int[] nums = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i].trim());
        }

        int longestLength = findLongestDecreasingSubsequence(nums);
        System.out.println("最长连续递减子序列的长度: " + longestLength);
    }


}
