import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetcode1071 {

    public String gcdOfStrings(String str1, String str2) {
        if ((str1+str2).equals(str2+str1)){
        int len1=str1.length();
        int len2=str2.length();
        int toge=gcd(len1,len2);
            return str1.substring(0,toge);
        }
        return "";
    }
    public int gcd(int a,int b){
        while (b!=0) {
            int flag = b;
            b = a % b;
            a = flag;
        }
        return a;
    }

    public static void main(String[] args) {
        String str1="ABCABCABC";
        String str2="ABC";
        leetcode1071 test=new leetcode1071();
        String ans=test.gcdOfStrings(str1,str2);
        System.out.println(ans);
    }
}
