package 栈与队列;
import java.util.*;

public class 删除字符串中的所有相邻重复项 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.hasNextBoolean();
        try{

        }catch(NullPointerException e){
            throw e;
        }
    }
}

class LeetCode1047 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(deque.isEmpty() || deque.peek()!= ch){
                deque.push(ch);
            }else{
                deque.pop();
            }
        }
        String str = "";
        while(!deque.isEmpty()){
            str = deque.pop() + str;
        }
        return str;
    }
}

class LeetCode1047_2{
    public String removeDuplicates(String s){
        StringBuffer buffer = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(top >= 0 && buffer.charAt(top) == ch){
                buffer.deleteCharAt(top);
                top--;
            }else{
                buffer.append(ch);
                top++;
            }
        }
        return buffer.toString();
    }
}