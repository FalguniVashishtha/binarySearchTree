package com.bridgelabz;

public class MainBinarySearchTree {
    public static void main(String[] args) {
        System.out.println("welcome to Binary Search Tree" +
                " program");

        BinaryTree bst = new BinaryTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is value is adding in root

        root = bst.insert(root, 30);

        // 30->56->70->80
        root = bst.insert(root, 70);

        bst.print(root);

    }
}
