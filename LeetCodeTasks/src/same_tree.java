public class same_tree {
    /*
        Given the roots of two binary trees p and q, write a function to check if they are the same or not.
        Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
    */
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
        p.right = new TreeNode(2);
        q.left = new TreeNode(1);
        p.left = new TreeNode(1);

        q.left.left = new TreeNode(1);
        p.left.left = new TreeNode(2);
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // если оба узла null
        if (p == null && q == null) return true;

        // если один из узлов null, а другой - нет
        if (p == null) return false;
        if (q == null) return false;

        // сравниваем значения если нет null
        if (p.val != q.val) return false;

        // если все удачно запускаем рекурсию на левый и правый узел дерева
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }

}

