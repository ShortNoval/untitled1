public class leetcode443 {
    int count=1;
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i - 1] == chars[i]) {
                count++;
            } else {
                sb.append(chars[i - 1]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        String compressedString = sb.toString();
        char[] compressedChars = compressedString.toCharArray();

        for (int i = 0; i < compressedChars.length; i++) {
            chars[i] = compressedChars[i];
        }

        return compressedChars.length;
    }

    public static void main(String[] args) {
        char[] str={'a','a','b','b','c','c','c'};
        leetcode443 te=new leetcode443();
        int ans=te.compress(str);
        System.out.println(ans);
    }
}
