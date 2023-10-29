package 联通数科;

import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int []nums = new int [input.length()];
        int sum = 0;
        for(int i = 0 ;i < input.length();i ++){
            nums[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += nums[i]*nums[i];
        }
        for(int i = input.length()-1 ;i >= 0;i --){
            nums[i] -=  (int)input.charAt(i);
        }
        boolean isPalindrome = true;
        for (int num : nums) {
            if (num != 0) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(sum + " 是回文整数");
        } else {
            System.out.println(-1 + " 不是回文整数");
        }
    }
}
