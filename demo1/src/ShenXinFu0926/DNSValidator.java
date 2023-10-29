package ShenXinFu0926;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 验证一个字符串是否是合法的DNS域名需要检查一些规则，如长度限制、字符允许范围、标签格式等
 */
public class DNSValidator {

    public static boolean isValidDNS(String domain) {
        // 验证DNS域名的长度是否合法
        if (domain.length() < 1 || domain.length() > 255) {
            return false;
        }

        // 验证DNS域名中的每个标签
        String[] labels = domain.split("\\.");
        for (String label : labels) {
            // 验证标签的长度是否合法
            if (label.length() < 1 || label.length() > 63) {
                return false;
            }
            // 验证标签中的字符是否合法
            if (!isValidLabelCharacters(label)) {
                return false;
            }
            // 检查标签开头和结尾是否是连字符
            if (label.startsWith("-") || label.endsWith("-")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidLabelCharacters(String label) {
        // 使用正则表达式验证标签中的字符是否合法
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9-]+$");
        Matcher matcher = pattern.matcher(label);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValidLabelCharacters(s));

    }
}
