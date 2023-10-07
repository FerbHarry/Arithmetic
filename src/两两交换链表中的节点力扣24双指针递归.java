import Dao.ListNode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class 两两交换链表中的节点力扣24双指针递归 {
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null) return head;//边界条件
        ListNode next = head.next;
        ListNode newNode = swapPairs(next);
        next.next = head;
        head.next = newNode;
        return next;
    }
}
