package day1109;

import java.util.Scanner;

public class DeleteCommonChar {
    /**
     * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
     *
     * @param s1 第一个字符串。
     * @param s2 第二个字符串。
     * @return 结果字符串。
     */
    public String solution(String s1, String s2) {
        String tmp = "[" + s2 + "]";
        String result = s1.replaceAll(tmp, "");
        return result;
    }

    public static void main(String[] args) {
        DeleteCommonChar d = new DeleteCommonChar();
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(d.solution(s1, s2));
    }
}
