import Dao.ListNode;

/**
 * 题意：反转一个单链表。
 * 示例: 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
 */

public class 反转链表力扣206双指针 {
    public ListNode reverseListNode(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null){
            temp = cur.next;//保存下一个节点
            cur.next = prev;//将当前节点的后续节点指向prev指针
            prev = cur;//将prev指针更新为cur
            cur = temp;//把cur更新为当前节点的后一个节点
        }
        return prev;
    }
}

