import Dao.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 */


public class 二叉树左子树之和力扣404 {
    //递归三部曲
    //1.确定返回值和参数列表：返回int值参数列表为根节点
    public static int leftSum(TreeNode root) {
        //2.确定终止条件
        if(root == null) return 0;
        //3.确定递归逻辑
        int left = 0;
        int right = 0;
        if(root.leftNode != null) { left = leftSum(root.leftNode); }
        if(root.rightNode != null) { right = leftSum(root.rightNode); }
        int midValue = 0;
        //左叶子节点需要通过父亲节点判断，父亲节点的左孩子的左右孩子都是null时可判断为叶子节点
        if(root.leftNode.leftNode == null && root.leftNode.rightNode == null)
            midValue = root.leftNode.val;
        return midValue + left + right;
    }
}
