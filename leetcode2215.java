import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int n:nums1){
            a.add(n);
        }
        for(int n1:nums2){
            b.add(n1);
        }
        for(int n2:nums2){
            a.remove(n2);
        }
        for (int n3:nums1){
            b.remove(n3);
        }
        return List.of(List.copyOf(a),List.copyOf(b));//List.of用于创建多个不同列表、
        //copyof用于创建新的数组，copyof(内容，长度)
    }
}
