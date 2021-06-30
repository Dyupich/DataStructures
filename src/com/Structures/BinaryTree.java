package com.Structures;

public class BinaryTree {

    private BinaryTreeNode root;

    public void add(int data)
    {
        if (root == null)
        {
            root = new BinaryTreeNode(data);
        }
        else
        {
            BinaryTreeNode temp = new BinaryTreeNode(data);
            BinaryTreeNode iterator = root;
//            BinaryTreeNode next;
//            for (boolean nodeFound = false; !nodeFound; iterator = next)
//            {
//
//                next = temp.data < iterator.data ? iterator.left : iterator.right;
//
//                if (next == null)
//                {
//                    nodeFound = true;
//                }
//            }
//



            for (BinaryTreeNode next = temp.data < iterator.data ? iterator.left : iterator.right;
                 next != null;
                 next = temp.data < iterator.data ? iterator.left : iterator.right)
            {
                iterator = next;
            }

            if (temp.data < iterator.data)
            {
                iterator.left = temp;
            }
            else
            {
                iterator.right = temp;
            }
        }
    }

    public void printTree()
    {
        root.print();
    }

    private class BinaryTreeNode {
        public int data;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public void print()
        {
            if (left != null)
            {
                left.print();
            }
            if (right != null)
            {
                right.print();
            }

            System.out.println(data);
        }

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}