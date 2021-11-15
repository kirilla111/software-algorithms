public class Task_5 {
    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero,
    except the number 0 itself.

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    * */

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = null;

        ListNode l = addTwoNumbers(l1, l2);

        while (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;

        String n1 = "";
        String n2 = "";

        while (l1 != null) {
            n1 += l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            n2 += l2.val;
            l2 = l2.next;
        }

        if (n1.equals("")) n1 = "0";
        if (n2.equals("")) n2 = "0";

        n1 = swap(n1);
        n2 = swap(n2);

        char[] sum = addStrings2(n1, n2).toCharArray();

        ListNode out = new ListNode(Integer.parseInt("" + sum[sum.length - 1]));
        ListNode first = new ListNode();

        first.next = out;

        for (int i = sum.length - 2; i >= 0; i--) {
            out.next = new ListNode(Integer.parseInt("" + sum[i]));
            out = out.next;
        }
        return first.next;
    }

    private static String swap(String n1) {
        char[] chars = n1.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tmp;
        }
        String out = "";
        for (char c : chars) {
            out += c;
        }
        return out;
    }

    public static String addStrings2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0
                || carry > 0; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
