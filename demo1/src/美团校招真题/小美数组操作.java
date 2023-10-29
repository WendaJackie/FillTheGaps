package 美团校招真题;


import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class 小美数组操作 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(minOperationFrequency(arr));
    }
    public static int minOperationFrequency(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int medium = nums[ n / 2 ];
        int oper = 0;
        for(int i = 0; i<n ;i++){
            oper = Math.abs(nums[i] - medium);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == medium){
                count ++ ;
            }
        }
        if(count == 2){
            return 0;
        } else {
            return oper;
        }

    }
}