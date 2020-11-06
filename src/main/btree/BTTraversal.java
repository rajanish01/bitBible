package main.btree;

/**
 * @author Rajanish
 * @date 5-Nov-2020
 */
public class BTTraversal {

    private static final BinaryTree tree = new BinaryTree();

    public static void inOrder(BinaryTree.Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.value + " ");
            inOrder(root.rightChild);
        }
    }

    public static void preOrder(BinaryTree.Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public static void postOrder(BinaryTree.Node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.value + " ");
        }
    }

    public static void levelOrder() {

    }

    public static void main(String[] args) {
        tree.insertUtil(50);
        tree.insertUtil(30);
        tree.insertUtil(20);
        tree.insertUtil(40);
        tree.insertUtil(70);
        tree.insertUtil(60);
        tree.insertUtil(80);

        System.out.println("Inorder :- ");
        inOrder(tree.root);

        System.out.println("\nPreorder :- ");
        preOrder(tree.root);

        System.out.println("\nPostorder :- ");
        postOrder(tree.root);

        System.out.println("\nLevel order :- ");
        levelOrder();
    }

}
