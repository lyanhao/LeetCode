package day1121;

import java.util.Scanner;

public class NikochesTheorem {
    /**
     * 尼科彻斯定理：任何一个整数 m 的立方都可以写成 m 个连续奇数之和。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            Double m3 = Math.pow(m, 3);
            Double m3temp = 0.0;
            StringBuffer sb = new StringBuffer();
            for (int i = 1; ; i += 2) {
                for (int j = i; j < i + 2 * m; j += 2) {
                    m3temp += j;
                }
                if (m3temp.equals(m3)) {
                    for (int j = i; j < i + 2 * m; j += 2) {
                        sb.append(j + "+");
                    }
                    break;
                } else
                    m3temp = 0.0;
            }
            System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
        }
    }
}
