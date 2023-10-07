package Dao;

public class TreeNode {
    public int val;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}
