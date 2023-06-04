package Dsa;

public class BinaryTree {
    private Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertNode(current.left, data);
        } else if (data > current.data) {
            current.right = insertNode(current.right, data);
        }

        return current;
    }

    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        } else if (data < current.data) {
            return searchNode(current.left, data);
        } else {
            return searchNode(current.right, data);
        }
    }

    // Other methods...
}
