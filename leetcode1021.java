import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode1021 {
    public String removeOuterParentheses(String s) {
        StringBuffer res=new StringBuffer();
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                stack.pop();
            }
            if (!stack.isEmpty()){
                res.append(c);
            }
            if (c=='('){
                stack.push(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str="(()())(())";
        leetcode1021 te=new leetcode1021();
        String ans=te.removeOuterParentheses(str);
        System.out.println(ans);
    }
}
