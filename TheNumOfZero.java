package day1115;

import java.util.Scanner;

public class TheNumOfZero {
    /**
     * 输入一个正整数，求 n！末尾有多少个 0？
     * 比如：n = 10; n! = 3628800; 所以答案为 2.
     *
     * @param args 输入的数
     * @return n！末尾的 0 的个数
     */

    public static void main(String[] args) {
        TheNumOfZero t = new TheNumOfZero();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int result = 0;
            while (n != 0) {
                result += n / 5;
                n /= 5;
            }
            System.out.println(result);
        }
    }
}
