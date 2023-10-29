/**
 * 小美有一个长度为 *n* 的数组，她想将这个数组进行求和，即 sum=a1+a2+...+an，
 * 小美可以使用一次魔法（也可以不使用），将其中一个加号变成乘号，
 * 使得 sum 最大,求出最大的sum 。
 */

package 美团校招真题;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class 小美魔法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (n == 1) {
            System.out.println(arr[0]);
        } else if (totalSum < 0) {
            System.out.println(totalSum - 2 * arr[0]);
        } else {
            System.out.println(totalSum - arr[0] - arr[1] + arr[0] * arr[1]);
        }
    }
}