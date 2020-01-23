public class CanConstruct {
    /**
     * LeetCode 383
     * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
     * 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
     * 如果可以构成，返回 true ；否则返回 false。
     * 为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。
     * <p>
     * 思路：
     * 如果 magazine 的长度小于 ransomNote 即不可能够，返回 false
     * 把 magazine 里的字母个数存在一个数组里，取 ransomNote 里的字母个数在 magazine 的数组里减
     * 如果不够就返回 false，够就返回 true
     *
     * @param args
     */
    public static void main(String[] args) {
        String ransom = "abcabc";
        String magazine = "aabbccdd";
        CanConstruct c = new CanConstruct();
        System.out.println(c.canConstruct(ransom, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        } else {
            int[] nums = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                nums[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                if (--nums[ransomNote.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
