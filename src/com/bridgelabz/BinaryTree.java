package com.bridgelabz;

class Node
{
    int data;
    Node left;
    Node right;
}
public class BinaryTree
{
    //method to insert root and value
    public Node insert(Node root, int val)
    {

        if (root == null) {
            return createNewNode(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);

        } else if (val > root.data)
        {
            root.right = insert(root.right, val);
        }
        return root;

    }
    //method name as createNewNode
    public Node createNewNode(int k)
    {
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

    //Size method For checking all nodes are added or Not
    public int size(Node node) {

        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
}