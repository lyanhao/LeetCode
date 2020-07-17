import java.math.BigInteger;
import java.util.Scanner;

public class AddMethod {
    /**
     * 设计一个算法完成两个超长正整数的加法.
     *
     * @param addend 加数
     * @param augend 被加数
     * @return
     */
    public String AddLongInteger(String addend, String augend) {
        BigInteger b1 = new BigInteger(addend);
        BigInteger b2 = new BigInteger(augend);
        BigInteger res = b1.add(b2);
        return res + "";
    }

    public static void main(String[] args) {
        AddMethod a = new AddMethod();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(a.AddLongInteger(s1, s2));
        }
    }
}
