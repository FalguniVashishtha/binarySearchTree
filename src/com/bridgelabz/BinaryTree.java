package com.bridgelabz;

class Node {
    int data;
    Node left;
    Node right;

}
public class BinaryTree
{
    public Node insert(Node root, int val)
    {
        if (root == null) {
            return craeteNewNode(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;

    }
    // method
    public Node craeteNewNode(int k) {
        Node bst = new Node();
        bst.data = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    // method to print
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);

        System.out.println(root.data);
        print(root.right);
    }

    public int size(Node node) {

        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
    public boolean nodePresent(Node root, int val)
    {
        if (root == null) {
            return false;
        }
        Boolean isPresent = false;
        while (root != null) {
            if (val < root.data) {
                root = root.left;
            } else if (val > root.data) {
                root = root.right;
            } else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}