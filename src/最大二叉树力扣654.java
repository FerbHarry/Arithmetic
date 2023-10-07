import Dao.TreeNode;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 */


public class 最大二叉树力扣654 {
    //直接操纵原数组节省空间不用切割一次就重新创建一个数组
    public TreeNode constructMaximumBinaryTree(int[] num, int begin, int end) {
        if(begin >= end) return null;

        int maxValueIndex = begin;
        for (int i = begin+1;i<end;i++){
            if(num[i] > num[maxValueIndex]) maxValueIndex = i;
        }

        TreeNode root = new TreeNode(num[maxValueIndex]);

        root.leftNode = constructMaximumBinaryTree(num, begin, begin+maxValueIndex);
        root.rightNode = constructMaximumBinaryTree(num, maxValueIndex+1, end);

        return root;

    }

}
