import java.util.Map;

public class leetcode334 {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = -1;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num > min) {
                if (j == -1) {
                    j = num;
                } else if (num > j) {
                    return true;
                } else {
                    j = num;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] num={20,100,10,12,5,13};
        leetcode334 tes=new leetcode334();
        boolean ans=tes.increasingTriplet(num);
        System.out.println(ans);
    }
}
