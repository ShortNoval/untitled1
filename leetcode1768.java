public class leetcode1768 {
    public String mergeAlternately(String word1, String word2) {
            int sign = Math.max(word1.length(), word2.length());
            int sign1=Math.min(word1.length(),word2.length());
            int k=sign1*2;
            char[] ans = new char[word1.length()+word2.length()];
            for (int i = 0; i < sign; i++) {
                char a = i < word1.length() ? word1.charAt(i) : '\0';
                char b = i < word2.length() ? word2.charAt(i) : '\0';
                if (a != '\0' && b != '\0') {
                    ans[2 * i + 1] = b;
                    ans[2 * i] = a;
                } else {
                    ans[k++] = i < word1.length() ? word1.charAt(i) : word2.charAt(i);
                }
            }
            return new String(ans);
    }

    public static void main(String[] args) {
        String word="abcd";
        String word2="pq";
        leetcode1768 test=new leetcode1768();
        String ans=test.mergeAlternately(word,word2);
        System.out.println(ans);
    }

}
