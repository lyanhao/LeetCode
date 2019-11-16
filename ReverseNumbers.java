package day1115;

import java.util.Scanner;

public class ReverseNumbers {
    /**
     * 输入一个整数，将这个整数以字符串的形式逆序输出.
     * 程序不考虑负数的情况，若数字含有 0，则逆序形式也含有 0，如输入为 100，则输出为 001.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
