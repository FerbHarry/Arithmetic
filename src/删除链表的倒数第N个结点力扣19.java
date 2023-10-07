import Dao.ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class 删除链表的倒数第N个结点力扣19 {

    public ListNode removeNthFromEnd(ListNode head, int n){
        //创建虚拟头节点
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode fast = dummyNode;
        ListNode slow = dummyNode;

        for (int i = 0;i < n;i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }

}
