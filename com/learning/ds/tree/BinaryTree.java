package com.learning.ds.tree;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

class BinaryTree {
    Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if(this.root == null) {
            this.root = newNode;
            return;
        }

        Node current = this.root;
        Node parent = null;
        while(current != null){
            parent = current;
            if(value < current.value){
                current = current.left;
            } else current = current.right;
        }

        if(value < parent.value) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public void insertRecursion(int value){
        Node newNode = new Node(value);
        if(this.root == null){
            this.root = newNode;
            return;
        }
        Node curr = this.root;
        Node parent = null;
        insertRecursionHelper(newNode, curr, parent);
    }

    private void insertRecursionHelper(Node newNode, Node curr, Node parent){
        if(curr == null) {
            if(newNode.value < parent.value){
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            return;
        }
        parent = curr;
        if(newNode.value < curr.value){
            curr = curr.left;
        } else {
            curr = curr.right;
        }
        insertRecursionHelper(newNode, curr, parent);
    }

    public void printBinaryTree() {
        Node current = this.root;
        if (current == null) {
            System.out.println("Nothing inside Tree");
            return;
        }
        while (current != null) {

        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {41, 20, 65, 11, 29, 50, 91};
        for (int item: arr){
//            tree.insert(item);
            tree.insertRecursion(item);
        }
        System.out.println(tree);
    }
}
