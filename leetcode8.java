import static java.lang.Long.MAX_VALUE;

public class leetcode8 {
    public int myAtoi(String s) {
        // 忽略前导空格
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 判断正负号
        int sign = 1;
        while (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1*sign;
            }
            i++;
        }

        // 读取数字字符并转换为整数
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 处理整数溢出
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        // 根据符号和整数值返回结果
        return num * sign;
    }

        public static void main(String[] args) {
           leetcode8 solution = new leetcode8();

            System.out.println(solution.myAtoi("42"));  // 输出 42
            System.out.println(solution.myAtoi("   -+----42"));  // 输出 -42
            System.out.println(solution.myAtoi(" 4193with words 1"));  // 输出 4193
            System.out.println(solution.myAtoi("words and 987"));  // 输出 0
            System.out.println(solution.myAtoi("-91283472332"));  // 输出 -2147483648
        }
}

