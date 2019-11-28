package day1127;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩都按先录入排列在前的规则处理。
 * 输入描述：
 * 输入多行，先输入要排序的人的个数，然后分别输入他们的名字和成绩，以一个空格隔开。
 * 输出描述：
 * 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开。
 */
public class RankingOfResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            Student.flag = sc.nextInt();
            Student[] stu = new Student[n];

            for (int i = 0; i < n; i++) {
                stu[i] = new Student(sc.next(), sc.nextInt());
            }

            Arrays.sort(stu);
            for (Student o : stu) {
                System.out.println(o);
            }
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int score;
    public static int flag = 0;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (flag == 0) {
            return o.score - score;
        }
        return score - o.score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}
