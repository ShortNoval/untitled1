import java.util.HashMap;
import java.util.Map;

public class leetcode290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> p2s = new HashMap<>();   // pattern中的字符到s中的字符子串的映射表
        Map<String, Character> s2p = new HashMap<>();   // s中的字符字串到pattern中的字符的映射表
        String[] words = s.split(" ");                  // 根据空格，提取s中的单词
        int n = pattern.length();
        int m = words.length;
        if(n != m){
            return false;   // 字符数和单词数不一致，一定不匹配
        }
       //char ch;
        String word;
        for(int i = 0; i < n; i++){
         char   ch = pattern.charAt(i);
            word = words[i];
            if((p2s.containsKey(ch) && !p2s.get(ch).equals(word)) || (s2p.containsKey(word) && s2p.get(word) != ch)){
                // 字符与单词没有一一映射：即字符记录的映射不是当前单词或单词记录的映射不是当前字符
                return false;
            }
            // 更新映射，已存在的映射更新后仍然是不变的；不存在的映射将被加入
            p2s.put(ch, word);
            s2p.put(word, ch);
        }
        return true;
    }


}
