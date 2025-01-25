package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTree_Anuj {
    static Scanner sc =null;

    static Node createTree(){
        Node root = null;
        System.out.print("Enter Data: ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter Left for "+data);
        root.left = createTree();

        System.out.println("Enter Right for "+data);
        root.right = createTree();

        return root;
    }

    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(root);
    }


}

