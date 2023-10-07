import Dao.TreeNode;

import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 */


public class 路径总和Ⅱ力扣113 {
    public List<List<Integer>> result;

    public void getPathSum(TreeNode root, List<Integer> paths, int count){
        if(root == null) return;
        paths.add(root.val);
        if(root.leftNode == null && root.rightNode == null && count == 0){
            result.add(paths);
            return;
        }

        if(root.leftNode == null && root.leftNode == null) return;

        if(root.leftNode != null) {
            getPathSum(root.leftNode, paths, count-root.leftNode.val);
            paths.remove(paths.size()-1);
        }
        if(root.rightNode != null) {
            getPathSum(root.rightNode, paths, count-root.rightNode.val);
            paths.remove(paths.size()-1);
        }
        return;
    }

}
