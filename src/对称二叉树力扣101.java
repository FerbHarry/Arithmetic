import Dao.TreeNode;

/**
 *给定一个二叉树，检查它是否是镜像对称的。
 */

public class 对称二叉树力扣101 {
    //递归写法（递归三要素）
    //1.确定返回值和形参列表,因为判断是否是镜像所以返回Boolean值最直观，形参列表为一个结点的左右孩子
    public static boolean compare(TreeNode left, TreeNode right){
        //2.确定终止条件
        if(left != right) return false;//如果左右孩子(Ps:并非同一结点的孩子而是外侧结点的)的val不相等则false
        else if(left == null && right != null) return false;//左空右不空返回false
        else if(left != null && right == null) return false;//右空左不空返回false
        else if(left == null && right == null) return true;//左右都空返回true
        //else return compare(left.leftNode, right.rightNode) && compare(left.rightNode,right.leftNode);
        //3.确定递归逻辑
        boolean outside = compare(left.leftNode, right.rightNode);
        boolean inside = compare(left.leftNode, right.rightNode);
        boolean isSame = outside && inside;
        return isSame;
    }


}
