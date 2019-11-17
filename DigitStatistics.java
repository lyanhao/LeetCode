package day1117;

import java.util.Scanner;

public class DigitStatistics {
    /**
     * 统计每种不同的个位数字出现的次数。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            int[] arr = new int[10];
            for (int i = 0; i < string.length(); i++) {
                arr[string.charAt(i) - '0']++;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.println(i + ":" + arr[i]);
                }
            }
        }
    }
}
