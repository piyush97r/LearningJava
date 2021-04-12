package com.DSA;

class nodes {
    int value;
    nodes leftchild, rightchild;

    nodes(int item) {
        value = item;
        leftchild = rightchild = null;
    }
}

class binarTree {
    nodes root;

    public int func(nodes nodes) {
        if (nodes == null)
            return 0;
        else {
            int lfunc = func(nodes.leftchild); //recursive call to traverse through the left side of the node
            int rfunc = func(nodes.rightchild); //recursive call to traverse through the right side of the node

            if (lfunc > rfunc)
                return (lfunc + 1);
            else
                return (rfunc + 1);
        }
    }
}