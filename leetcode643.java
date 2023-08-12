public class leetcode643 {
    //滑动窗口问题
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        // 计算初始的k个元素的和
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        // 滑动窗口，计算每个窗口的和并更新最大和的值
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];//依次更新数据，往后挪更新最大值
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;

    }

    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        leetcode643 tesx=new leetcode643();
        double l=tesx.findMaxAverage(nums,k);
        System.out.println(l);

    }
}
