
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode145 {
    //二叉树的后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null; // 用于记录上一个访问的节点

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root); // 将当前节点入栈
                root = root.left; // 继续遍历左子树
            } else {
                TreeNode current = stack.peek(); // 获取栈顶元素（当前节点）
                if (current.right != null && current.right != prev) {
                    root = current.right; // 继续遍历右子树
                } else {
                    result.add(current.val); // 将当前节点的值加入结果集
                    prev = current; // 更新 prev 为当前节点
                    stack.pop(); // 弹出当前节点
                }
            }
        }

        return result;

    }
}
