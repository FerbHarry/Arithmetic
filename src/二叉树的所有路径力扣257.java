import Dao.TreeNode;

import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 */



public class 二叉树的所有路径力扣257 {
    //递归三部曲
    //1.确定返回值和参数列表
    //返回的是一个String类型列表每一个String都是一个路径
    public static void traversal(TreeNode root, List<Integer> paths, List<String> result){
        //2.确定终止条件
        paths.add(root.val);
        if(root.rightNode == null && root.leftNode == null){
            StringBuilder str = new StringBuilder();
            int size = paths.size();
            for (int i = 0;i < size - 1;i++){
                str.append(paths.get(i).toString()).append("->");
            }
            str.append(paths.get(paths.size()-1));
            result.add(str.toString());
            return;
        }
        //3.确定循环逻辑
        if(root.leftNode != null) {
            traversal(root.leftNode, paths, result);
            paths.remove(paths.size()-1);
        }

        if(root.rightNode != null) {
            traversal(root.rightNode, paths, result);
            paths.remove(paths.size()-1);
        }


    }
}
