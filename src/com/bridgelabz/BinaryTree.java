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

    // create a method name as print , they are printing data
    public void print(Node root) {

        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);

        //null right side
        print(root.right);
    }
}