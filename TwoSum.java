import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * LeetCode 001
     * 给定一个整数数组 nums 和一个目标值 target
     * 请你在该数组中找出和为目标值的那 两个 整数
     * 并返回他们的数组下标。
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSumByDoubleLoop(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return result;
    }

    private int[] twoSumByHashMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                return new int[] {map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum res = new TwoSum();
        //给定数组nums和目标值target
        int[] nums = new int[]{2, 3, 4, 15};
        int target = 7;
        res.twoSumByDoubleLoop(nums, target);
        res.twoSumByHashMap(nums,target);
    }
}