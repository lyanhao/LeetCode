package day1114;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumber {
    /**
     * 找出 n 个数里最小的 k 个
     * 每个测试输入包含空格分割的 n+1 个整数，最后一个整数为k值,n 不超过100。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] array = new int[strings.length - 1];
        for (int i = 0; i < strings.length - 1; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(array);

        for (int i = 0; i < Integer.parseInt(strings[strings.length - 1]); i++) {
            System.out.print(array[i]);
            if (i != Integer.parseInt(strings[strings.length - 1]) - 1) {
                System.out.print(" ");
            }
        }
    }
}
