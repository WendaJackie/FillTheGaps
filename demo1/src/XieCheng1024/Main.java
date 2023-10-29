package XieCheng1024;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int q = in.nextInt();
        in.nextLine();
        for(int i = 0; i < q;i++){
            String []command = in.nextLine().split(" ");
            int op = Integer.parseInt(command[0]);
            int x = Integer.parseInt(command[1]);
            if(op == 1){
                int y = Integer.parseInt(command[2]);
                s = performOperation1(s, x, y);
            } else if(op ==2){
                String str = command[2];
                s = performOperation2(s, x, str);
            }
        }
        System.out.println(s);
    }
    public static String performOperation1(String s, int x, int y){
        String prefix = s.substring(0, x-1);
        String suffix = s.substring(y);
        return prefix + suffix;
    }
    public static String performOperation2(String s, int x, String str){
        String prefix = s.substring(0, x);
        String suffix = s.substring(x);
        return prefix + str + suffix;
    }
}