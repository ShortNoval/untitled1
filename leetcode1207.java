import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> falg=new HashMap<>();
        for (int ar:arr){
            if(falg.containsKey(ar)){
                falg.put(ar,falg.get(ar)+1);
            }else {
                falg.put(ar,1);
            }
        }
        Set<Integer> count=new HashSet<>();
        for (int num:falg.values()){
            if(count.contains(num)){
                return false;
            }else {
                count.add(num);
            }
        }
    return true;
    }
}
