import java.util.HashMap;
import java.util.Map;

public class leetcode2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int ans=0;
        for (int i=0;i<nums.length;i++){
            int t=nums[i];
            int dec=t-k;
            int inc=t+k;
            if(map.containsKey(dec)){
                ans+=map.get(dec);
            }if (map.containsKey(inc)){
                ans+=map.get(inc);
            }
            map.put(t,map.getOrDefault(t,0)+1);
        }
        return ans;
    }

}
