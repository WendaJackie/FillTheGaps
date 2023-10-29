package 网易1015;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
        // 输入的是一个字符串
        String xStr = sc.nextLine();
//        String xStr = Integer.toString(x);
        int[] digits = new int[xStr.length()];

        for (int i = 0; i < xStr.length(); i++) {
            digits[i] = xStr.charAt(i) - '0';
        }
        Arrays.sort(digits);
        int sum = 0;
//        int left = 0;
//        int right = digits.length - 1;
//
//        while(left <= right){
//            if(left == right){
//                sum += digits[left];
//            } else if (digits[left] + digits[right] <= 100) {
//                sum += digits[left] * 10 + digits[right];
//            } else {
//                sum += digits[right];
//                right--;
//                continue;
//            }
//            left ++;
//            right --;
//        }
        for (int i = digits.length - 1; i >= 0; i -= 2) {
//            int pair = digits[i];
            if (i - 1 >= 0) {
                sum += digits[i] + digits[i - 1] * 10;
            } else {
                sum += digits[i];
            }
        }
        System.out.println(sum);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }
}
