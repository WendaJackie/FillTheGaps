package test;

import java.util.HashSet;

public class 两个数组的交集 {

}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if ( nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 ){
            return new int[0];
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> reset = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if(set1.contains(i)){
                reset.add(i);
            }
        }
        int n = reset.size();
        int[] ints = new int[n];
        int j = 0;
        for (Integer integer : reset) {
            ints[j] = integer;
            j++;
        }
        return ints;
    }
}
