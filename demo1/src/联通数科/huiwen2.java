package 联通数科;

import java.util.Scanner;

public class huiwen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; // 负数不是回文数
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
