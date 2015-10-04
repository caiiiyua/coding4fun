import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution { 

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        if (listNode != null) {
            a.add(printNode(a, listNode));
        }
        return a;
    }

    private Integer printNode(ArrayList<Integer> a, ListNode listNode) {
        if (listNode.next != null) {
            a.add(printNode(a, listNode.next));
        }
        return listNode.val;
    }

    public static void main(String args[]) {
        System.out.println("Test");
        ListNode l = new ListNode(67);
        l.next = new ListNode(0);
        ListNode p = l.next;
        p.next = new ListNode(24);
        p = p.next;
        p.next = new ListNode(58);
        Solution s = new Solution();
        ArrayList<Integer> a = s.printListFromTailToHead(l);
        System.out.println(a);
    }
}