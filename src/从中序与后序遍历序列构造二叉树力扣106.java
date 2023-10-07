import Dao.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * 注意: 你可以假设树中没有重复的元素。
 */


public class 从中序与后序遍历序列构造二叉树力扣106 {

    Map<Integer,Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return findNode(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd){

        if(inBegin >= inEnd || postBegin >= postEnd) return null;

        int rootIndex = map.get(postorder[postorder.length-1]);
        TreeNode root = new TreeNode(rootIndex);
        int lenOfLeft = rootIndex - inBegin;
        root.leftNode = findNode(inorder, inBegin, rootIndex,
                postorder, postBegin, postBegin+lenOfLeft);
        root.rightNode = findNode(inorder, rootIndex + 1, inEnd,
                postorder, postBegin+lenOfLeft + 1, postEnd - 1);

        return root;
    }

}
