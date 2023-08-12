// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        leetcode290 solution = new leetcode290();

        // 测试用例1
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        boolean result1 = solution.wordPattern(pattern1, s1);
        System.out.println("Test Case 1: " + result1);

        // 测试用例2
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        boolean result2 = solution.wordPattern(pattern2, s2);
        System.out.println("Test Case 2: " + result2);

        // 测试用例3
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        boolean result3 = solution.wordPattern(pattern3, s3);
        System.out.println("Test Case 3: " + result3);



    }

}