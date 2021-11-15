import java.lang.reflect.Array;
import java.util.ArrayList;

class Test {

    public static void main(String[] args) {
        Test t = new Test();
        int[] ints = new int[]{3,1,2,5,23,1,2};
        t.sortArray(ints);

        for (int i:
             ints) {
            System.out.println(i);
        }
    }

    public int[] sortArray(int[] nums) {
        Tree tree = new Tree();
        tree.treeins(nums);
        tree.toArray(tree.root,nums);
        return nums;
    }


    class Tree {
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
        int head = 0;
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

        void treeins(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                insert(arr[i]);
            }

        }


        void toArray(Node root, int[] sortedArray) {
            if (root != null) {
                toArray(root.left, sortedArray);
                sortedArray[head] = root.key;
                head++;
                toArray(root.right, sortedArray);
            }
        }
    }
}