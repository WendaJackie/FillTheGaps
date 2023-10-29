package 农银金科2023;

import java.util.Scanner;

public class ClockOverlap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        scanner.close();

        // 计算重合时刻
        String overlapTime = calculateOverlapTime(time);

        System.out.println(overlapTime);
    }

    // 计算时针和分针重合的时刻
    private static String calculateOverlapTime(int time) {
        int minutes = 0;
        for (int i = time; i <= time + 1; i++) {
            int hours = i % 12; // 将小时数限制在0到11之间
            int minuteHandPosition = hours * 60;
            int hourHandPosition = i % 12 * 60;
            int diff = Math.abs(minuteHandPosition - hourHandPosition);
            if (diff < minutes || minutes == 0) {
                minutes = diff;
            }
        }

        int overlapHour = time % 12;
        int overlapMinute = minutes;
        return String.format("%02d:%02d", overlapHour, overlapMinute);
    }
}
