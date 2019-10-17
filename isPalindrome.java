import java.util.Scanner;

public class Palindrome {
    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *思路：
     * 首先排除负数，然后将输入的 int 型转换成 String 型后拆分成字符数组，再进行逆置，用 long 型的 result 进行保存，
     * 防止转换后的数值大于 Integer.MAX_VALUE ,并进行判断，若 result 大于 Integer.MAX_VALUE 则 return false;
     * 否则将 long 型的 result 强制转换回 int 型并与输入的 x 进行比较，若相等则 return ture;
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            System.out.println("负数");
            return false;
        }
        String s = String.valueOf(x);
        char chars[] = s.toCharArray();
        String newString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            newString += chars[i];
        }
        long result = Long.valueOf(newString);
        if (result > Integer.MAX_VALUE) {
            System.out.println("超过");
            return false;
        } else if ((int) result == x) {
            System.out.println("yes");
            return true;
        }
        System.out.println("no");
        return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        p.isPalindrome(scanner.nextInt());
    }
}
