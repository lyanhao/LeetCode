import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Scanner;

public class Fibonacci {
    public static List<Integer> fib() {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        list.add(a);
        while (a < 1000000) {
            int c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        System.out.println(list.toString());
        return list;
    }

    public static int minNum(int i) {
        int min = 0;
        List<Integer> listOfMin = new ArrayList<>();
        for (int n = 0; n < fib().size(); n++) {
            int cur = fib().get(n);
            if (i != cur) {
                int c = Math.abs(cur - i);
                listOfMin.add(c);
            } else {
                int c = 0;
                listOfMin.add(c);
            }
        }
        System.out.println(listOfMin.toString());
        listOfMin.sort(null);
        System.out.println(listOfMin.toString());
        min = listOfMin.get(0);
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minNum(n);
    }
}
