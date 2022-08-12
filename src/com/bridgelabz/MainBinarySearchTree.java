package com.bridgelabz;
public class MainBinarySearchTree
{
    public static void main(String[] args) {
        System.out.println("welcome to Binary Search Tree" + " program");

        BinaryTree bst = new BinaryTree();
        Node root = null;

        root = bst.insert(root, 56); // 56 is value is adding in root

        root = bst.insert(root, 30);

        // 30->56->70->80
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);

        System.out.println(bst.nodePresent(root, 63));

        if(root != null)
            System.out.println("\nElement 63 is present in the binary tree");
        else
            System.out.println("\nElement 63 is not present in the binary tree");

    }
}

