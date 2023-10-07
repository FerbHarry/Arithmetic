import Dao.TreeNode;

import java.util.List;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */


public class 路径总和力扣112 {
    //用减的不用加了在比，可以简化代码
    public static boolean pathSum(TreeNode root, int target) {
        if(root  == null) return false;
        if(root.rightNode == null && root.leftNode == null && target == 0) return true;

        return pathSum(root.leftNode, target- root.val) || pathSum(root.rightNode, target - root.val);

    }
    ////////////////////////////////////////////////////////////////////////////////////
    //自己写的加法代码量很多
    //1.确定返回值和参数列表
    public static boolean searchSum(TreeNode root, List<Integer> paths, int target) {
        paths.add(root.val);
        //2.确定终止条件
        if(root.leftNode == null && root.rightNode == null) {
            int result = 0;
            for (int i = 0;i<paths.size();i++){
                result += paths.get(i);
            }
            if(result == target) return true;
            else return false;
        }

        //3.确定递归逻辑
        boolean left = false;
        if(root.leftNode != null) {
            left = searchSum(root.leftNode, paths, target);
            paths.remove(paths.size()-1);
        }
        boolean right = false;
        if(root.rightNode != null) {
            right = searchSum(root.rightNode, paths, target);
            paths.remove(paths.size()-1);
        }

        return right || left;
    }
}
