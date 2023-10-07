import Dao.ListNode;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表没有交点，返回 null 。
 */
//因为是单链表所以只能指向一个后面的结点所以只要相交从相交后面的结点数目一定相等

public class 链表相交面试题 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        while(curA != null){//求A表长度
            curA = curA.next;
            lenA++;
        }
        while(curB != null){//求B表长度
            curB = curB.next;
            lenB++;
        }

        curA = headA;
        curB = headB;
        if(lenB < lenA){
            //交换头节点
            ListNode tempNode = curA;
            curA = curB;
            curB = tempNode;
            //交换长度
            lenA ^= lenB;
            lenB ^= lenA;
            lenA ^= lenB;
        }
        int a = lenA - lenB;
        //将两链表末尾对其
        while(a-->0){
            curA = curA.next;
        }
        while(curA != null){
            if(curA == curB)
                return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}
