public class Task_2 {
    /*
    Given the head of a linked list and an integer val,
    remove all the nodes of the linked list that has Node.val == val,
     and return the new head.
    * */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);
        l1.next.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next.next = new ListNode(6);

        l1 = removeElements(l1,6);

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {

        // Узел first нужен для ссылки на первый элемент самого списка
        ListNode first = new ListNode();
        ListNode mainList = new ListNode();
        first.next = mainList;

        if (head == null) return null;

        // Проверка на существование итогового списка
        boolean notNull = false;

        // Присвоение первого элемента списка
        if (head.val != val){ mainList.val = head.val; notNull = true;}
        else {
            while (head.next != null){
                head = head.next;
                if (head.val != val){
                    mainList.val = head.val;
                    notNull = true;
                    break;
                }
            }
        }

        // присвоение остальных элементов
        while (head.next != null){
            head = head.next;
            if (head.val != val){
                mainList.next = head;
                notNull = true;
                mainList = mainList.next;
            }
        }

        // Проверка на случайное присвоение лишнего элемента в конец списка
        // (если у head осталась ссылка на элемент == val)
        if (mainList.next != null && mainList.next.val == val) mainList.next = null;

        // возврат null если ни один элемент не был добавлен
        if (!notNull) return null;

        return first.next;
    }
}
