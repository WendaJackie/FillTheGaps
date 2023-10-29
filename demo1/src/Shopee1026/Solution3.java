package Shopee1026;

import java.util.*;

// 字符串处理

public class Solution3 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     * @param str string字符串
     * @param n int整型
     * @return string字符串
     */
    public String moveSubStr(String str, int n) {
        // write code here
        if(str == null || str.isEmpty() || n <= 1){
            return str;
        }
        n = (n-1) % str.length();
        String substring = str.substring(n);
        String prefix = str.substring(0, n);
        return substring + prefix;
    }
}
