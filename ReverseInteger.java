import java.util.Scanner;

class Reverse {
    /**
     * LeetCode 007
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * 思路：
     * 首先判定输入 x 的大小，若超过 Integer 的范围则 return 0; 
     * 注意负数的转换：先求出绝对值，逆置后再乘 （-1）;
     * 然后将输入的 int 型转换成 String 型后拆分成字符数组，再进行逆置，用 long 型的 result 进行保存，
     * 防止转换后的数值大于 Integer.MAX_VALUE ,并进行判断，若 result 大于 Integer.MAX_VALUE 则 return 0;
     * 否则将 long 型的 result 强制转换回 int 型并输出。
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
