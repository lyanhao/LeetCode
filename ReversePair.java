public class ReversePair {
    /**
     * 给定一个 int 数组 A 和它的大小 n，返回数组 A 中的逆序对个数。
     * 逆序对：前一个数大于后一个数。
     *
     * @param A 给定数组
     * @param n 数组大小
     * @return 数组中逆序对的个数
     */
    public int count(int[] A, int n) {
        if (A == null || A.length <= 1) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ReversePair r = new ReversePair();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 0};
        int[] B = {1, 2, 4, 3, 4, 7, 5, 6, 7, 0};
        int na = 8;
        int nb = 10;
        System.out.println(r.count(A, na));
        System.out.println(r.count(B, nb));
    }
}
