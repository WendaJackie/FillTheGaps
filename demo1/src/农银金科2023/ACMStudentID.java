package 农银金科2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

// 这个是对的

public class ACMStudentID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 使用正则表达式来提取8位学号
        Pattern pattern = Pattern.compile("\\d{4}\\d{4}");
        Matcher matcher = pattern.matcher(input);
        
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String studentID = matcher.group();
            result.append(studentID).append(" ");
        }

        // 移除最后一个空格
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());
    }
}
