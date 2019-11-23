package day1122;

import java.util.Scanner;

public class UnusualAdd {
    /**
     * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
     * 给定两个int A和B。请返回A＋B的值
     *
     * @param A 加数
     * @param B 加数
     * @return 两数之和
     */
    public int addAB(int A, int B) {
        if (A == 0) {
            return B;
        } else if (B == 0) {
            return A;
        } else {
            int a = A ^ B;
            int b = (A & B) << 1;
            return addAB(a, b);
        }
    }

    public static void main(String[] args) {
        UnusualAdd u = new UnusualAdd();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.println(u.addAB(A, B));
        }
    }
}
