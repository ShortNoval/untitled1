public class leetcode151 {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");//去多重空格或一个空格符号分割字符串放入数组
        int left=0;
        int right=str.length-1;
        while (left<right){
            String temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        return String.join(" ",str);

    }

    public static void main(String[] args) {
        String str="  hello world  ";
        leetcode151 a=new leetcode151();
        String ans=a.reverseWords(str);
        System.out.println(ans);
    }
}
