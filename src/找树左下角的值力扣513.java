import Dao.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个二叉树，在树的最后一行找到最左边的值
 */
//使用层序遍历最方便直接记录每一组的第一个值
public class 找树左下角的值力扣513 {
    public static int findLeft(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int result = 0;
        while(!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0;i < size; i++){
                TreeNode temp = deque.poll();
                if(i == 0) result = temp.val;
                if(temp.leftNode != null) deque.offer(temp.leftNode);
                if(temp.rightNode != null) deque.offer(temp.rightNode);
            }
        }
        return result;
    }
}
