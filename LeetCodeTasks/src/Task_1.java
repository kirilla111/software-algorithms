public class Task_1 {
    /*
    Merge two sorted linked lists and return it as a sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    * */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(7);

        ListNode l = mergeTwoLists(l1, l2);

        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        // Узел first нужен для ссылки на первый элемент самого списка
        ListNode first = new ListNode();
        ListNode mainList = new ListNode();

        first.next = mainList;

        // Возврат одного из списков если один из них нуллевой
        if (l1 == null || l2 == null)
            if (l1 == null) return l2;
            else return l1;

        // присвоение для первого элемента списка
        if (l1.val > l2.val) {
            mainList.val = l2.val;
            l2 = l2.next;
        } else {
            mainList.val = l1.val;
            l1 = l1.next;
        }

        // присвоение остальных элементов перебором двух списков
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                mainList.next = l2;
                l2 = l2.next;
            } else {
                mainList.next = l1;
                l1 = l1.next;
            }
            mainList = mainList.next;
        }
        // присвоение остатка из первого списка (если он остался)
        if (l1 != null) mainList.next = l1;

        // присвоение остатка из второго списка (если он остался)
        if (l2 != null) mainList.next = l2;

        return first.next;
    }
}

