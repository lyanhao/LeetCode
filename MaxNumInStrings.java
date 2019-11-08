package day03;

import java.util.Scanner;

public class MaxNumInStrings {
    /**
     * 读入一个字符串 str,输出字符串 str 中连续最长的数字串。
     *
     * @param str 输入字符串
     * @return 连续最长数字串
     */
    public String solution(String str) {
        int count = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    end = i;
                }
            } else {
                count = 0;
            }
        }
        return str.substring(end - max + 1, end + 1);
    }

    public static void main(String[] args) {
        MaxNumInStrings m = new MaxNumInStrings();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(m.solution(str));
        }
    }
}
