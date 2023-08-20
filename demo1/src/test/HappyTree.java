package test;
import java.util.*;


public class  HappyTree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int a = 0;
        if (scanner.hasNext()) {
            a = scanner.nextInt();
        }
        System.out.println(isHappy(a));
        scanner.close();
//        int x = 10;
//        int y = 20;
//        swap(x , y);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while ( n!=1 && !set.contains(n)){
            set.add(n);
            n = HappyNumber(n);
        }
        return n==1;
    }

    private static int HappyNumber(int n){
        int sum = 0;
        while( n > 0 ){
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }

}

/*class Solution2 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while ( n!=1 && !set.contains(n)){
            set.add(n);
            n = HappyNumber(n);
        }
        return n==1;
    }

    private int HappyNumber(int n){
        int sum = 0;
        while( n > 0 ){
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
}*/
