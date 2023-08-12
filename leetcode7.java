public class leetcode7 {
    public int reverse(int x){
        int sign=1;
        if(x<0){
            sign=-1;
            x=Math.abs(x);
        }
        int ans=0;
        String strx=String.valueOf(x);
        int i=strx.length()-1;
        while(i>=0){
            int  intx=strx.charAt(i)-'0';
            if(ans>Integer.MAX_VALUE/10){
                return 0;
            }
            ans=intx+ans*10;

            i--;
        }
        return ans*sign;
    }
}
