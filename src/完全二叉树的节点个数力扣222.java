import Dao.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * 给出一个完全二叉树，求出该树的节点个数。
 */



public class 完全二叉树的节点个数力扣222 {
    //递归三部曲
    //1.确定返回值跟参数列表。个数返会值为int，传入一个root节点
    public static int getNodeNum(TreeNode root){
        //2.确定终止条件
        if(root == null) return 0;
        //3.确定递归逻辑
        int left = getNodeNum(root.leftNode);
        int right = getNodeNum(root.rightNode);
        return left + right + 1;//算上中间节点
    }
    //层序遍历
    public static int cGetNodeNum(TreeNode root){
        Deque<TreeNode>  deque = new LinkedList<>();
        int num = 0;
        deque.offer(root);
        while(!deque.isEmpty()){
            int len = deque.size();
            for (int i = 0;i<len; i++){
                num++;
                TreeNode temp = deque.poll();
                if(temp.leftNode != null) deque.offer(temp.leftNode);
                if(temp.rightNode != null) deque.offer(temp.rightNode);
            }
        }
        return num;
    }

}
