import java.util.Arrays;

public class leetcode1732 {
    public int largestAltitude(int[] gain) {
        int[] high=new int[gain.length+1];
        high[0]=0;
        int max=high[0];
        for (int i=0;i< gain.length;i++){
            high[i+1]=high[i]+gain[i];
            if(high[i+1]>max){
                max=high[i+1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        leetcode1732 test=new leetcode1732();
        int [] gain={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int ans=test.largestAltitude(gain);
        System.out.println(ans);

    }
}
