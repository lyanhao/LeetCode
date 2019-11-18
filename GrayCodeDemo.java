package day1118;

import java.util.*;

public class GrayCodeDemo {
    /**
     * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同，则称这种编码为格雷码(Gray Code)。
     * 请编写一个函数，使用递归的方法生成 N 位的格雷码。
     *
     * @param n
     * @return
     */
    public String[] getGray(int n) {
        String[] result = null;
        if (n == 1) {
            result = new String[]{"0", "1"};
        } else {
            String[] str = getGray(n - 1);
            result = new String[2 * str.length];
            for (int i = 0; i < str.length; i++) {
                result[i] = "0" + str[i];
                result[result.length - 1 - i] = "1" + str[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        GrayCodeDemo g = new GrayCodeDemo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(g.getGray(n));
    }
}
