package XieCheng1024;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int []cities = new int[1001];
        int []expectations = new int[n];
        for(int i = 0; i < n; i++){
            int city = in.nextInt();
            int expectation = in.nextInt();
            expectations[i] = expectation;
            // if(cities[city]==0){
            //     cities[city] = expectation;
            // }else{
            cities[city] = Math.max(cities[city], expectation);
            // }
        }
        Arrays.sort(expectations);
        int totalExpectation = 0;
        for(int i = n-1; i >= 0; i--){
            if( k > 0){
                totalExpectation += expectations[i];
                k--;
            } else {
                break;
            }
        }
        for(int i = 1; i <= 1000; i++){
            totalExpectation += cities[i];
        }
        System.out.println(totalExpectation);
    }
}

/**
 * 4 3
 * 1 5
 * 1 6
 * 1 7
 * 3 8
 */

/**
 * 36
 */