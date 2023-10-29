package DeWu1018;

import java.util.*;

/**
 * 不包含110的最长子串（程序有点问题）
 */
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLength = 0;
        int resultLength = 0;
        for(int start = 0; start < s.length(); start ++){
            int currentLength = 0;
            int i = start;
            while(i < s.length()){
                if(s.charAt(i) == '0'){
                    currentLength ++;
                    i++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    if( i + 2 < s.length() && s.charAt(i+1) == '1' && s.charAt(i+2) =='0'){
                        maxLength = Math.max(maxLength, currentLength);
                        currentLength = 0;
                        i++;
                    } else {
                        currentLength ++;
                        i++;
                        maxLength = Math.max(maxLength, currentLength);
                    }
                }
                maxLength = Math.max(maxLength, currentLength);
            }
            resultLength = Math.max(resultLength, maxLength);
        }
        System.out.println(resultLength);
    }
}