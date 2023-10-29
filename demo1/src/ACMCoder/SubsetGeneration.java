package ACMCoder;

import java.util.*;

public class SubsetGeneration {
    public static List<List<Integer>> findSubsets(int[] S) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // 添加空集

        for (int num : S) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(num);
                subsets.add(subset);
            }
        }

        return subsets;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break; // 结束输入
            }
            String[] elements = line.split(" ");
            for (String element : elements) {
                try {
                    int num = Integer.parseInt(element);
                    inputList.add(num);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
//                    System.out.println("输入无效的整数：" + element);
                }
            }
        }

        // 如果是需要去重处理
        Set<Integer> uniqueInputSet = new HashSet<>(inputList);
        int[] S = new int[uniqueInputSet.size()];
        int index = 0;
        for (int num : uniqueInputSet) {
            S[index] = num;
            index++;
        }

//        int[] S = new int[inputList.size()];
//        for (int i = 0; i < inputList.size(); i++) {
//            S[i] = inputList.get(i);
//        }

        List<List<Integer>> result = findSubsets(S);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
