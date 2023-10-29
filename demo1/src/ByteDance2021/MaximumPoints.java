package ByteDance2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        List<Point> maxPoints = findMaximumPoints(points);
        Collections.reverse(maxPoints); // Reverse the list to get the correct order

        for (Point point : maxPoints) {
            System.out.println(point.x + " " + point.y);
        }
    }

    private static List<Point> findMaximumPoints(List<Point> points) {
        int n = points.size();
        List<Point> maxPoints = new ArrayList<>();
        int maxY = -1;

        for (int i = n - 1; i >= 0; i--) {
            Point point = points.get(i);
            if (point.y > maxY) {
                maxPoints.add(point);
                maxY = point.y;
            }
        }

        return maxPoints;
    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
