import Dao.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
 */


public class 平衡二叉树力扣110 {
    //递归求法（三部曲）
    //1.确定返回值和参数列表,题目要求虽然是判断是否是平衡二叉树看似要返回boolean
    //实际是返回int因为要计算子树的高度，返回int值用-1来表示不是平衡二叉树
    public static int getHeight(TreeNode root){
        //2.确定终止条件
        if(root == null) return 0;//不能返回-1要计算高度
        //3.确定递归逻辑
        int leftHeight = getHeight(root.leftNode);
        if(leftHeight == -1) return -1;//如果左子树等于-1则返回-1整个二叉树都不是平衡二叉树
        int rightHeight = getHeight(root.rightNode);
        if(rightHeight == -1) return -1;//右子树同理只要一个返回-1则整个二叉树都不是平衡二叉树
        return Math.abs(leftHeight - rightHeight) > 1 ? -1:1 + Math.max(leftHeight,rightHeight);
    }

    public static boolean isBalanced(TreeNode root){
        return getHeight(root) == -1 ? false:true;
    }
}
