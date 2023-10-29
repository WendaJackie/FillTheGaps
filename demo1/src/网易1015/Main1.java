package 网易1015;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int day = (int) Math.ceil((double)a / b);
            System.out.println(day);
        }

    }
}