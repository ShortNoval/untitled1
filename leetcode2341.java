import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode2341 {
    public int[] numberOfPairs(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, !map.getOrDefault(num, false));
            if (!map.get(num)) {
                count++;
           }

        }
        return new int[]{count, nums.length - 2 * count};
    }
    public static void main(String[] args){
        leetcode2341 test1=new leetcode2341();
        int[] nums = {1,3,2,1,3,2,2};
        int[] result = test1.numberOfPairs(nums);
        System.out.println(result[0]);
        System.out.println( result[1]);
    }
}
