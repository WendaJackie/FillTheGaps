package AlgorithmDay2;

import java.util.Scanner;

public class ISBNBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ISBN = new int[n];
        for (int i = 0; i < n; i++) {
            ISBN[i] = scanner.nextInt();
        }

        // 去重
        int k = 0;
        int[] uniqueISBN = new int[n];

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < k; j++) {
                if (ISBN[i] == uniqueISBN[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueISBN[k] = ISBN[i];
                k++;
            }
        }

        // 冒泡排序
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (uniqueISBN[j] > uniqueISBN[j + 1]) {
                    int temp = uniqueISBN[j];
                    uniqueISBN[j] = uniqueISBN[j + 1];
                    uniqueISBN[j + 1] = temp;
                }
            }
        }

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(uniqueISBN[i] + " ");
        }
    }
}
