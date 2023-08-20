package test;

import java.util.HashMap;

public class 无重复的最长子串 {

}

class solution{
    public int lengthOfLongestSubstring(String s){
        if(s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}

//滑动窗口：
/**
 * 定义字符串和整型的HashMap
 * 字符串的charAt为获得i处的字符
 * containskey 判断是否含有K值
 * map.get(k)，得到k对应的值。即得到某个字符对应的值
 *
 */


class Solution1 {
    public String longestPalindrome(String s) {
        return null;
    }
}