package 农银金科2023;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractStudentIDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" "); // 以空格分割输入字符串
        ArrayList<String> studentIDs = new ArrayList<>();

        // 遍历分割后的部分，提取学号信息
        for (String part : parts) {
            if (part.length() == 8) { // 学号长度固定为8位
                studentIDs.add(part);
            }
        }

        // 将学号信息以空格分隔的形式输出
        String result = String.join(" ", studentIDs);
        System.out.println(result);
    }
}
