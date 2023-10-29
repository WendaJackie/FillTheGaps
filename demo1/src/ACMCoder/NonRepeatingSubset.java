package ACMCoder;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonRepeatingSubset {
    public static List<Integer> findNonRepeatingSubset(int[] data) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> nonRepeatingSubset = new ArrayList<>();

        for (int element : data) {
            if (!seen.contains(element)) {
                nonRepeatingSubset.add(element);
                seen.add(element);
            }
        }

        return nonRepeatingSubset;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        System.out.println("请输入数据（以空格分隔，输入q结束）:");

        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }

//        scanner.nextLine();

//        while (true) {
//            if (scanner.hasNextInt()) {
//                inputList.add(scanner.nextInt());
//            } else {
//                String line = scanner.nextLine();
//                if (line.isEmpty()) {
//                    break;
//                } else {
//                    System.out.println("请输入有效的整数。");
//                }
//            }
//        }

        int[] data = new int[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            data[i] = inputList.get(i);
        }

        List<Integer> result = findNonRepeatingSubset(data);

        System.out.println("不重复数据的子集:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
