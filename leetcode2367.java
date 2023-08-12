import java.util.HashMap;
import java.util.Map;

public class leetcode2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer,Integer> flag=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            flag.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int num2=num1+diff;
            int num3=num2+diff;
            if(flag.containsKey(num1)&&flag.containsKey(num2)&&flag.containsKey(num3)){
                count++;
            }
        }
        return count;
        }


    public static void main(String[] args) {
        int[] num={0,1,4,6,7,10};
        int diff=3;
        leetcode2367 test1=new leetcode2367();
        int ans=test1.arithmeticTriplets(num,diff);
        System.out.println(ans);
    }

}
