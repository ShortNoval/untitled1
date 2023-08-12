import java.util.*;

public class leetcode1679 {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int i=0,j= nums.length-1;
        while (i<j){
            if(nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            }else if(nums[i]+nums[j]>k){
                j--;
            }else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []nums={3,5,1,5};
        int k=2;
        leetcode1679 test=new leetcode1679();
        int count=test.maxOperations(nums,k);
        System.out.println(count);
    }
}
