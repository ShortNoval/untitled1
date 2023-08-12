import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcode1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            charSet.add(ch); // 将allowed中的字符添加到哈希表中
        }

        int count = 0;

        for (String word : words) {
            boolean consistent = true;
            for (char ch : word.toCharArray()) {
                if (!charSet.contains(ch)) {
                    consistent = false; // 如果word中的字符不在哈希表中，则该字符串不一致
                    break;
                }
            }
            if (consistent) {
                count++; // 统计一致字符串的数量
            }
        }

        return count;
    }
}
