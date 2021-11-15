public class Task_3 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        l1 = reverseList(l1);

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    /*
        Given the head of a singly linked list,
        reverse the list,
        and return the reversed list.
    */

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        // null - для первой итерации
        ListNode prev = null;

        while (cur != null) {
            // запоминаем остаток списка
            ListNode next = cur.next;

            // переопределяем ссылку на следующий элемент как ссылку на уже перевернутую часть списка
            cur.next = prev;

            // перевернутый список
            prev = cur;

            // уменьшаем список на 1 элемент
            cur = next;
        }
        return prev;
    }
}
