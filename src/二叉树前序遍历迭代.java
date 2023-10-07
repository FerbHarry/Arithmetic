import Dao.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树前序遍历迭代 {
    public List<Integer> preorderTraversal(TreeNode root){
        if(root == null){ return null; }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
                TreeNode node = stack.pop();
            if(node != null){
                //先加右节点因为先进后出，右先进出来的是左节点
                if(node.rightNode != null){
                    stack.push(node.rightNode);
                }
                if(node.leftNode != null){
                    stack.push(node.leftNode);
                }
                stack.push(node);
                stack.push(null);
            } else {
                TreeNode temp = stack.pop();
                result.add(temp.val);
            }

        }
        return result;
    }
}
