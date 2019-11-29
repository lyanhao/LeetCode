package day1125;

import java.util.Scanner;

/**
 * 一个DNA序列由A/C/G/T四个字母的排列组合组成。
 * G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。
 * <p>
 * 输入描述：
 * 输入一个string型基因序列，和int型子串的长度。
 * <p>
 * 输出描述：
 * 找出GC比例最高的子串,如果有多个输出第一个的子串。
 */
public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            int max = 0;
            int max_begin_index = 0;

            for (int i = 0; i < str.length() - n; i++) {
                int count = 0;
                for (int j = i; j < i + n; j++) {
                    if (str.charAt(j) == 'G' || str.charAt(j) == 'C') {
                        count++;
                    }
                }
                if (max < count) {
                    max_begin_index = i;
                    max = count;
                }
            }
            System.out.println(str.substring(max_begin_index, max_begin_index + n));
        }
    }
}

