package com.Structures;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(0);
        tree.add(-1);
        tree.add(-2);
        tree.add(-3);

        tree.printTree();

    }
}
