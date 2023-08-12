import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode589 {
    public List<Integer> preorder(Node root) {

        List<Integer> array=new ArrayList<>();
        if(root==null){
            return array;
        }
        Stack stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node= (Node) stack.pop();
            array.add(node.val);
            for (int i=node.children.size()-1;i>=0;i--){
                stack.push(node.children.get(i));
        }
        }
        return array;
    }
}
