package day01;

import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n - 1, K);

    }

    public int findKth(int[] a, int left, int right, int K) {
        int i = left;
        int j = right;
        int point = a[left];

        while (i < j) {
            while (i < j && a[j] >= point) {
                j--;
            }
            if (i < j) {
                a[i++] = a[j];
            }
            while (i < j && a[i] <= point) {
                i++;
            }
            if (i < j) {
                a[j--] = a[i];
            }
        }
        a[i] = point;

        int big_num = right - i;

        if (K - big_num - 1 == 0) {
            return point;
        } else if (K - big_num - 1 > 0) {
            return findKth(a, left, i - 1, K - big_num - 1);
        } else {
            return findKth(a, i + 1, right, K);
        }


    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 2};
        Finder f = new Finder();
        System.out.println(f.findKth(a,5, 3));

    }
}
