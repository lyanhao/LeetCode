package day01;

import java.util.Scanner;

public class PlalindromeString {

    private static boolean isPlalindrome(String s1, String s2) {
        return s1.equals(s2);
    }

    private static int Plalindrome(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int count = 0;
        for (int i = 0; i <= m; i++) {
            StringBuilder sb = new StringBuilder(m + n);
            sb.append(s1, 0, i);
            sb.append(s2);
            sb.append(s1, i, m);
            if (isPlalindrome(sb.toString(), sb.reverse().toString())) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(Plalindrome(s1, s2));
        }
        scanner.close();
    }
}

