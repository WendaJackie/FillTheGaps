package test;
import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<>();

        sites.put(1,"Google");
        sites.put(2,"Baidu");
        sites.put(3,"Taobao");
        System.out.println("sites HashMap" + sites);

        String value1 = sites.getOrDefault(1, "Not Found");
        System.out.println("Value for key 1:" + value1);

        String value2 = sites.getOrDefault(4, "Not Found");
        System.out.println("Value for key 4:" + value2);

        System.out.println(sites.containsKey(1));

        HashMap<Integer, Integer> site = new HashMap<>();
        site.put(1,1);
        int key2 = 4;
        int[] key3 = {1, 2, 3, 4, 5, 6};
        Integer key1 = site.getOrDefault(2, key3[2] + 1);
        System.out.println(key1);

    }
}
