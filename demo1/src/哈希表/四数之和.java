package 哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
    public static void main(String[] args) {

    }

}

class Solution1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > 0 && nums[i] > target){
                return list;
            }

            //去重
            if( i > 0 && nums[i-1] == nums[i]){
                continue;
            }

            for( int j = i+1 ; j<nums.length ; j++){
                if( j > i+1 && nums[j-1] == nums[j]){
                    continue;
                }

                int left = j+1;
                int right = nums.length - 1;
                while (right > left){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if( sum > target){
                        right --;
                    }else if ( sum < target){
                        left ++;
                    }else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;
                        left++;
                        right--;
                    }
                }
            }
        }
        return list;
    }
}