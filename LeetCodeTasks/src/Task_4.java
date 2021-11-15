public class Task_4 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);


        l1 = swapPairs(l1);

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    /*
    * Given a linked list, swap every two adjacent nodes and return its head.
    *  You must solve the problem without modifying the values in the list's nodes
    * (i.e., only nodes themselves may be changed.)
    *
    * Input: head = [1,2,3,4]
      Output: [2,1,4,3]
    * */
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode zeroNode = new ListNode();
        zeroNode.next = head;

        while (head.next != null && head.next.next != null) {
            // обмен значений элементов
            int val = head.val;
            head.val = head.next.val;
            head.next.val = val;

            head = head.next.next;
        }
        // для нечетного кол-ва узлов
        if (head.next != null){
            int val = head.val;
            head.val = head.next.val;
            head.next.val = val;
        }

        return zeroNode.next;
    }
}
