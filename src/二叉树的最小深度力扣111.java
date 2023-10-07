import Dao.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。!!!(注意)
 * 说明: 叶子节点是指没有子节点的节点。
 */


public class 二叉树的最小深度力扣111 {
    //递归三部曲(采用后序遍历)PS：后序遍历算高度，前序遍历算深度
    //1.首先确认返回值和参数列表。因为是最小深度返回int，传入一个二叉树的根节点
    public static int minDepth(TreeNode root){
        //2.确认终止条件
        if(root == null) return 0;
        //3.确认递归逻辑
        int left = minDepth(root.leftNode);
        int right = minDepth(root.rightNode);
        //题目要求：最小深度是从根节点到最近叶子节点最短路径上的节点数
        if(root.leftNode == null && root.rightNode != null) return 1 + right;//左边是空节点则最小为右最小加1
        if(root.leftNode != null && root.rightNode == null) return 1 + left;//右边是空节点则最小为左边最小加1
        return 1 + Math.min(left,right);

    }
    //层序遍历
    public static int getDepth(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        int minDepth = 0;
        deque.offer(root);
        while(!deque.isEmpty()){
            int len = deque.size();
            minDepth++;
            for (int i = 0;i<len;i++){
                TreeNode temp = deque.poll();
                //层序遍历左右孩子都为null时为叶子节点
                if(temp.leftNode == null && temp.rightNode == null) return minDepth;
                if(temp.leftNode != null) deque.offer(temp.leftNode);
                if(temp.rightNode != null) deque.offer(temp.rightNode);
            }
        }
        return minDepth;
    }

}
