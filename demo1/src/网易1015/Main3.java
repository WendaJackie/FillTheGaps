package 网易1015;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> languages = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            ArrayList<Integer> person = new ArrayList<>();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int language = sc.nextInt();
                person.add(language);
            }
            languages.add(person);
        }

        boolean[] visited = new boolean[n];
        int connectGroups = 0;
        for(int i = 0; i< n;i++){
            if(!visited[i]){
                dfs(i, visited, languages);
                connectGroups++;
            }
        }
        System.out.println(connectGroups-1);
    }

    public static void dfs(int person, boolean[] visited, ArrayList<ArrayList<Integer>> languages){
        visited[person] = true;
        for(int lang : languages.get(person)){
            for(int i = 0; i < languages.size(); i++){
                if(!visited[i] && languages.get(i).contains(lang)){
                    dfs(i, visited, languages);
                }
            }
        }
    }
}
