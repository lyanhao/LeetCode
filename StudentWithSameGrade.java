package day1123;

import java.util.Scanner;

/**
 * 读入N名学生的成绩，将获得某一给定分数的学生人数输出。
 * 输入描述：
 * 测试输入包含若干测试用例，每个测试用例的格式为
 * 第1行：N
 * 第2行：N名学生的成绩，相邻两数字用一个空格间隔。
 * 第3行：给定分数
 * 当读到N=0时输入结束。其中N不超过1000，成绩分数为（包含）0到100之间的一个整数。
 * <p>
 * 输出描述：
 * 对每个测试用例，将获得给定分数的学生人数输出。
 */
public class StudentWithSameGrade {
    private static int COUNT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                return;
            }

            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int grade = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == grade) {
                    COUNT++;
                }
            }
            System.out.println(COUNT);
        }
    }
}
