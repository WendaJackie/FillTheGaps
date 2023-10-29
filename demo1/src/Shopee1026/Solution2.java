package Shopee1026;

import java.util.*;
import static Shopee1026.Solution2.areSimilar;


public class Solution2 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     * 
     * @param strs string字符串 一维数组 
     * @return int整型
     */
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        UnionFind uf = new UnionFind(n);
        for(int i = 0; i < n; i++){
            for(int j = i+1 ; j < n; j++){
                if(areSimilar(strs[i], strs[j])){
                    uf.union(i ,j);
                }
            }
        }
        return uf.count();
    }

    public static  boolean areSimilar(String str1, String str2){
        int diffCount = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                diffCount ++;
                if(diffCount > 2){
                    return false;
                }
            }
        }
        return diffCount == 2 || diffCount == 0;
    }

    static class UnionFind{
        int []parent;
        public UnionFind(int n){
            parent = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(parent[x] == x){
                return x;
            }
            return parent[x] = find(parent[x]);
        }

        public void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX != rootY){
                parent[rootX] = rootY;
            }
        }
        
        public int count(){
            int groups = 0;
            for(int i = 0 ; i < parent.length; i++){
                if(parent[i] == i){
                    groups++;
                }
            }
            return groups;
        }
    }

}
