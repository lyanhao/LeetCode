import java.util.Scanner;

class Reverse {
    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 输入: 123
     * 输出: 321
     * <p>
     * 输入: -123
     * 输出: -321
     * <p>
     * 输入: 120
     * 输出: 21
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        if (x == -2147483648) {
            return 0;
        }
        boolean isFu = false;
        if (x < 0) {
            isFu = true;
        }
        String s = String.valueOf(Math.abs(x));
        char[] chars = s.toCharArray();
        String newString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            newString += chars[i];
        }
        long result = Long.valueOf(newString);
        if (isFu) {
            result = (-1) * result;
            if (result < Integer.MIN_VALUE) {
                return 0;
            }
            return (int) result;
        } else {
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) result;
        }
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("转换后：" + r.reverse(scanner.nextInt()));
    }
}
