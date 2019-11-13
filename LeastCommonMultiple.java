package day1113;

import java.util.Scanner;

public class LeastCommonMultiple {
    /**
     * 交换 a 和 b 的值。
     *
     * @param a
     * @param b
     */
    public void swap(int a, int b) {
        int t = a;
        a = b;
        b = a;
    }

    /**
     * 利用辗转相除法求 x 和 y 的最大公因数。
     *
     * @param x
     * @param y
     * @return
     */
    public int greatestCommonDivisor(int x, int y) {
        if (x < y) {
            swap(x, y);
        }
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    /**
     * 利用公式法求 m和n的最小公倍数。
     * 公式：两个数的乘积等于这两个数的最大公约数与最小公倍数的积。
     *
     * @param m
     * @param n
     * @return
     */
    public int leastCommonMultiple(int m, int n) {
        return (m * n) / greatestCommonDivisor(m, n);
    }

    public static void main(String[] args) {
        LeastCommonMultiple l = new LeastCommonMultiple();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(l.leastCommonMultiple(A, B));
        }
    }
}
