import Dao.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历  {

    public static List<List<Integer>> checkfun(TreeNode root){
        List<List<Integer>> resList = new ArrayList<List<Integer>>();//大集合来存放每层的元素
        if(root == null) return resList;
        Queue<TreeNode> que = new LinkedList<>();//用队列过度运用对列先进先出的特性
        que.offer(root);//添加根节点
        /**
         * 大致思路
         * 每次循环添加当前层的所有结点的子节点也就是下一层的结点
         * 在下次循环开始时记录队列的长度
         * 根据队列长度循环向子集合中添加当前层数结点，同时又添加了本层的所有孩子结点为下次循环做准备
         * ps:根据队列先进先出的特性首先进来的时排在前民的孩子结点
         */
        while(!que.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int len = que.size();
            while(len-- > 0){
                TreeNode next = que.poll();
                if(next.leftNode != null) que.offer(next.leftNode);
                if(next.rightNode != null) que.offer(next.rightNode);
                res.add(next.val);
            }
            resList.add(res);
        }
        return resList;
    }

}
