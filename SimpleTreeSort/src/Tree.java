import java.util.ArrayList;

class Tree {

    // Class containing left and
    // right child of current
    // node and key value
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of Tree
    Node root;

    // Constructor
    Tree() {
        root = null;
    }

    // This method mainly
    // calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
    insert a new key in Tree */
    Node insertRec(Node root, int key) {
 
        /* If the tree is empty,
        return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur
        down the tree */
        if (key < root.key) root.left = insertRec(root.left, key);
        else root.right = insertRec(root.right, key);

        /* return the root */
        return root;
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void treeins(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

    }

    void toArray(Node root, ArrayList<Integer> sortedArray) {
        if (root != null) {
            toArray(root.left, sortedArray);
            sortedArray.add(root.key);
            toArray(root.right, sortedArray);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Tree tree = new Tree();
        int arr[] = {5, 4, 7, 2, 11, 2, 2, 3, 7, 1, 1, 1, 1, 12};
        tree.treeins(arr);
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        tree.inorderRec(tree.root);

        tree.toArray(tree.root, sortedArray);
        System.out.println("\n" + sortedArray);
    }

}