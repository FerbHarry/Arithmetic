import Dao.TreeNode;

import java.util.List;


public class Test {
    //给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
    //说明: 叶子节点是指没有子节点的节点。

    List<List<Integer>> result;

    public void getSumPaths(TreeNode root, List<Integer> paths, int target) {
        paths.add(root.val);

        if(root == null) return;
        if(root.leftNode == null && root.rightNode == null && target == 0) {
            result.add(paths);
            return;
        }
        if(root.rightNode == null && root.leftNode == null) return;

        if(root.leftNode != null) {
            getSumPaths(root.leftNode, paths, target-root.leftNode.val);
            paths.remove(paths.size()-1);//回溯
        }
        if(root.rightNode != null) {
            getSumPaths(root.rightNode, paths, target-root.rightNode.val);
            paths.remove(paths.size()-1);//回溯
        }

        return;
    }

}
