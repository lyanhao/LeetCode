package day03;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    /**
     * 给定一个字符串 A 和它的长度 n, 判断字符串是否为一个合法的括号序列。
     * 合法字符串定义为：
     * 1.只包括括号字符。
     * 2.左括号和右括号一一对应。
     *
     * @param A 输入字符串
     * @param n 输入字符串的长度
     * @return 该字符串是否为合法括号序列。
     */
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stk = new Stack<Character>();
        if (A == null || A.length() != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                stk.push(A.charAt(i));
            } else if (A.charAt(i) == ')') {
                if (stk.isEmpty()) {
                    return false;
                } else {
                    stk.pop();
                }
            } else {
                return false;
            }
        }
        if (!stk.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(p.chkParenthesis(str, str.length()));
        }
    }
}
