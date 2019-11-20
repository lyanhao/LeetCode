package day1120;

import java.util.Scanner;

public class Obama {

    /**
     * 输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
     * 输出由给定字符 C 画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%（四舍五入取整）。
     *
     * @param n 正方形边长
     * @param c 所使用字符
     */
    public void solution(int n, String c) {
        int row = n / 2;
        if (n % 2 != 0) {
            row = n / 2 + 1;
        }
        if (row == 2) {
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < row - 2; i++) {
                System.out.print(c);
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        Obama o = new Obama();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        o.solution(n, c);
    }
}
