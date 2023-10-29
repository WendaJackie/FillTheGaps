package XieCheng1024;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int n = num.length();
        int []digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = num.charAt(i) - '0';
        }
        int result = countWays(digits);
        System.out.println(result);
    }

    public static int countWays(int []digits) {
        int result = 0;
        int n = digits.length;
//        int number = 0;

        // 这里要考虑类似10072这种，如何避开这些0
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                int []subArray = new int [j-i+1];
                int index = 0;
                for(int k = i ; k <= j ; k++){
                    subArray[index] = digits[k];
                    index ++;
                }
                int number = 0;
                for(int digit : subArray){
                    number = number * 10 + digit;
                }
                if(number % 72 ==0){
                    result ++;
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(digits[i] == 0){
                result ++;
            }
        }
        return result;
    }
}
