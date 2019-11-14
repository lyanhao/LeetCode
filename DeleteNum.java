package day1114;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteNum {

    /**
     * 有一个数组 a[N] 顺序存放 0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头j继续进行，求最后一个被删掉的数的原始下标位置。
     * 如果大于1000，则对 a[999] 进行计算。
     *
     * @param nums 传入的数组成员数。
     * @return 最后一个被删掉的数的原始下标位置
     */
    public int solution(int nums) {
        List<Integer> list = new ArrayList<>();
        if (nums <= 1000) {
            for (int i = 0; i < nums; i++) {
                list.add(i);
            }

            int j = 0;
            while (list.size() > 1) {
                j = (j + 2) % list.size();
                list.remove(j);
            }

        } else {

            for (int i = 0; i <= 999; i++) {
                list.add(i);
            }

            int j = 0;
            while (list.size() > 1) {
                j = (j + 2) % list.size();
                list.remove(j);
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        DeleteNum d = new DeleteNum();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(d.solution(n));
        }
    }
}
