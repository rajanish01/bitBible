package main.btree;

/**
 * @author Rajanish
 * @date 5-Nov-2020
 */
public class BinaryTree {

    public BinaryTree() {
    }

    public static class Node {

        public int value;

        public Node rightChild;

        public Node leftChild;

        public Node(int value) {
            this.value = value;
            this.rightChild = null;
            this.leftChild = null;
        }

    }

    public Node root;

    public void inserUtil(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node root) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val > root.value) {
            root.rightChild = insert(val, root.rightChild);
        } else if (val < root.value) {
            root.leftChild = insert(val, root.leftChild);
        }

        return root;
    }

    public void delete(int val) {

    }
}
