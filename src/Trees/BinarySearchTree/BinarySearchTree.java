package Trees.BinarySearchTree;

public class BinarySearchTree {
public class Node{
    private int value;
    private int height;
    private Node left;
    private Node right;

    public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){

    }

    public int  height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.print(details +  node.getValue());

        display(node.left, details + "  Left child of " + node.getValue() + " : ");
        display(node.right, details + "  Right child of " + node.getValue() + " : ");

    }

    public void insert(int value){

    }

    private Node insert(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value, node.left);
        }
        if(value>node.value){
            node.right = insert(value, node.right);
        }
        return node;
    }
}
