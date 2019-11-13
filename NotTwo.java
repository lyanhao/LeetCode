package day1113;

import java.util.Scanner;

/**
 * W*H的网格盒子，行编号0~H-1，列编号0~W-1，任意两块蛋糕的欧几里得距离不能等于2.
 */


public class NotTwo {

    public static void main(String[] args) {
        int[][] a = new int[1000][1000];
        int W = 0;
        int H = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (a[i][j] == 0) {
                    result++;
                    if ((i + 2) < W) {
                        a[i + 2][j] = -1;
                    }
                    if ((j + 2) < H) {
                        a[i][j + 2] = -1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
