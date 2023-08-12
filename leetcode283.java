import java.util.Arrays;

public class leetcode283 {
    public static void moveZeroes(int[] nums) {
        int k = 0; // 用于记录非零元素的位置
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        // 将剩余的位置用 0 填充
        while (k < nums.length) {
            nums[k++] = 0;
        }}
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        // 输出: [1, 3, 12, 0, 0]
    }
}
