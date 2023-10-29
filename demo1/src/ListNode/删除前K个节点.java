package ListNode;

import java.lang.annotation.Target;

public class 删除前K个节点 {
    public static void main(String[] args) {

    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int nums = 0;
        ListNode cur = head;
        while(cur != null){
            nums++;
            cur = cur.next;
        }
        cur = head;
        int m = 0;
        if( nums >= k ){
            while( cur != null ){
                m++;
                if( m == k){
                    break;
                }
                cur = cur.next;
            }
        }else{
            return null;
        }
        return cur.next;
    }
}
