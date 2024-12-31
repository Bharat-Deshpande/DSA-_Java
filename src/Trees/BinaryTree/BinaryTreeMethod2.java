package Trees.BinaryTree;

class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}
public class BinaryTreeMethod2 {
    Node root;

    public BinaryTreeMethod2() {
        root = null;
    }


    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }


    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }


    void preOrderTraversal() {
        preOrder(root);
    }

    void inOrderTraversal() {
        inOrder(root);
    }

    void postOrderTraversal() {
        postOrder(root);
    }


    public static void main(String[] args) {
        BinaryTreeMethod2 tree = new BinaryTreeMethod2();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.preOrderTraversal();

        System.out.println("\nInorder traversal:");
        tree.inOrderTraversal();

        System.out.println("\nPostorder traversal:");
        tree.postOrderTraversal();
    }
}
