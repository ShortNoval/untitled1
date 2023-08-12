import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode392 {
    public boolean isSubsequence(String s, String t) {
        int lens=s.length();
        int lent=t.length();
        int i=0,j=0;
        while (i<lent&&j<lens){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==lens;
    }

    public static void main(String[] args) {
        String s = "raq";
        String t="ahbgdc";
        leetcode392 test=new leetcode392();
        boolean ans=test.isSubsequence(s,t);
        System.out.println(ans);
    }
}
