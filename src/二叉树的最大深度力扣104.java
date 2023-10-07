import Dao.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
//二叉树节点的深度；从根节点到该节点的最长简单路径的节点数
//二叉树节点的高度；从该节点到叶子节点的最长简单路径的节点数
//根节点的高度就是二叉树的最大深度
public class 二叉树的最大深度力扣104 {
    //递归求最大深度
    //1.确定返回值和参数裂表返回值为int，参数列表为根节点
    public static int getdepth(TreeNode node){
        //2.确定终止条件
        if(node == null)  return 0;
        //3.确定递归逻辑
        int left = getdepth(node.leftNode);
        int right = getdepth(node.rightNode);
        int depth = 1 + Math.max(left, right);
        return depth;
    }
    //最大深度层序遍历
    public static int maxDepth(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int maxDepth = 0;
        while(!deque.isEmpty()){
            int len = deque.size();
            maxDepth++;
            for (int i = 0;i < len;i++){
                TreeNode temp = deque.poll();
                if (temp.leftNode != null) deque.offer(temp.leftNode);
                if (temp.rightNode != null) deque.offer(temp.leftNode);
            }
        }
        return maxDepth;
    }
}
