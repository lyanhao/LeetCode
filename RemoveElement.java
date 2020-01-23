public class RemoveElement {
    /**
     * LeetCode 27
     * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};   //11
        int val = 0;    //9
        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }
}
