
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Stack;

public class leetcode590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node=stack.pop();
            result.add(node.val);
            for (Node child:node.children){
                stack.push(child);
            }
        }

        Collections.reverse(result);
        return result;//在Java中，Collections是一个实用工具类，提供了许多静态方法用于操作和处理集合（Collection）对象。它提供了一系列方法来对集合进行排序、查找、填充、拷贝等操作
    }
}
