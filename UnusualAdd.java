package day1122;

import java.util.Scanner;

public class UnusualAdd {
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
