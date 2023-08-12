import java.util.HashMap;
import java.util.Map;

public class leetcode1657 {
    public boolean closeStrings(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m != n) {
            return false;
        }

        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        // 统计每个字符出现的个数
        for (int i = 0; i < m; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            freqMap1.put(c1, freqMap1.getOrDefault(c1, 0) + 1);
            freqMap2.put(c2, freqMap2.getOrDefault(c2, 0) + 1);
        }

        // 检查字符种类是否相同
        if (!freqMap1.keySet().equals(freqMap2.keySet())) {//keySet()方法用于找出哈希表的键集合
            return false;
        }

        // 检查各字符出现的次数是否相同
        Map<Integer, Integer> countMap1 = new HashMap<>();
        Map<Integer, Integer> countMap2 = new HashMap<>();

        // 统计 freqMap1 中每个字符出现的次数
        for (int count : freqMap1.values()) {
            countMap1.put(count, countMap1.getOrDefault(count, 0) + 1);
        }

        // 统计 freqMap2 中每个字符出现的次数
        for (int count : freqMap2.values()) {
            countMap2.put(count, countMap2.getOrDefault(count, 0) + 1);
        }

        // 检查各字符出现的次数是否相同
        return countMap1.equals(countMap2);

    }

    public static void main(String[] args) {
        leetcode1657 test=new leetcode1657();
        String word1="cabbba";
        String word2="abbccc";
        boolean fa=test.closeStrings(word1,word2);
        System.out.println(fa);
    }
}
