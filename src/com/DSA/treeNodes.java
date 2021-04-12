package com.DSA;

    // class representing a node (element) in a tree
    class Node {
        int data; // value contained inside a node
        nodes left, right; // left & right children of a node

        // constructor to set the data of a node to the passed value and make it a leaf node
        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // class representing a binary tree
    class Tree {
        nodes root; // root node of the binary tree

        // constructor to create an empty tree with no root node
        Tree() {
            root = null;
        }
    }

    // driver class to create tree and test code
    public class treeNodes {

               /*int height(nodes root) {
            if (root == null)
                return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }*/

        // Method to traverse the elements of a tree using BFS (level-order traversal) in recursive way
        /*void levelOrderOrBFS() {
            int h = height(roots);
            for (int i = 1; i <= h; i++)
                printNodesAtLevel(roots, i, 1);
        }

        // Method to print nodes at the given level
        void printNodesAtLevel (Node root, int level, int currentLevel) {
            if (root == null)
                return;
            if (level == currentLevel)
                System.out.print(root.data + " ");
            else {
                printNodesAtLevel(root.left, level, currentLevel + 1);
                printNodesAtLevel(root.right, level, currentLevel + 1);
            }*/
        }

