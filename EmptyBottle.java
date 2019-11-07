package day2;

import java.util.Scanner;

public class EmptyBottle {
    /**
     * 三个空汽水瓶换一瓶新的汽水，最后手里剩两空瓶时可以向老板借一瓶，喝完再还三个空瓶。
     *
     * @param n 手中汽水瓶的个数
     * @return 最多可喝到的瓶数
     */
    public int solution(int n) {
        if (n < 2) {
            return 0;
        }

        int sum = 0;
        int bottlesum = n;

        while (bottlesum >= 2) {

            sum += bottlesum / 3;
            bottlesum = bottlesum % 3 + bottlesum / 3;
            
            if (bottlesum == 2) {
                sum++;
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        EmptyBottle e = new EmptyBottle();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(e.solution(sc.nextInt()));
        }
    }

}
