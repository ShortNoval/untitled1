import java.util.Arrays;

public class leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] left=new int[nums.length];
        left[0]=1;
        int[] right=new int[nums.length];
        right[nums.length-1]=1;
        for(int i=1;i< nums.length;i++){
            int flag=nums[i];
            left[i]=nums[i-1]*left[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            right[j]=nums[j+1]*right[j+1];
        }
        for (int m=0;m< nums.length;m++){
            ans[m]=left[m]*right[m];
        }
        return ans;
    }
    //利用求前后缀乘积的方式得出结果
    //left数组放每一个元素的前缀乘积
    //righ数组放每一个元素的后缀元素的乘积

    public static void main(String[] args) {
        leetcode238 test=new leetcode238();
        int[] nums = {1, 2, 3, 4};
        int [] ans= test.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
