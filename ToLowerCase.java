import java.util.Scanner;

public class ToLowerCase {
    /**
     * LeetCode 709
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToLowerCase.toLowerCase(sc.next());
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] <= 90 && (int) chars[i] >= 65) {
                int x = (int) chars[i] + 32;
                chars[i] = (char) x;
            }
        }
        str = String.copyValueOf(chars);
        System.out.println(str);
        return str;
    }
}
