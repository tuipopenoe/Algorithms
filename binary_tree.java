// Tui Popenoe
// BinaryTree.java

public class BinaryTree{
    private Node root;

    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int new_data){
            left = null;
            right = null;
            data = new_data;
        }
    }

    // Create an empty binary tree -- null root pointer
    public void BinaryTree(){
        root = null;
    }

    // Returns true if given target is in the binary tree, uses recursive helper
    public boolean lookup(int data){
        return(lookup(root, data));
    }



    // Recursive lookup -- given a node, recurse down searching for given data
    // O(log(n))
    private boolean lookup(Node node, int data){
        if(node == null){
            return(false);
        }
        if(node == node.data){
            return(true);
        }
        else if(data < node.data){
            return(lookup(node.left, data));
        }
        else{
            return(lookup(node.right, data));
        }
    }

    // Inserts the given data into the binary tree. Uses a recursive helper
    public void insert(data){
        root = insert(root, data);
    }

    // Recursive insert -- given a node, recurse down and insert the given data 
    // into the tree. Returns the new node
    private Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        }
        else{
            if(data <= node.data){
                node.left = insert(node.left, data);
            }
            else{
                node.right = insert(node.right, data);
            }
        }

        return(node);
    }
}