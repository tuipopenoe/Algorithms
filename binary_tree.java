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
        if(dataoh == node.data){
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

    public int size(){
        return(size(root));
    }

    private int size(Node node){
        if(node == null){
            return (0);
        }
        else{
            return size(node.left) + 1 + size(node.right);
        }
    }

    public int max_depth(){
        return max_depth(root);
    }

    private int max_depth(Node node){
        if(node == null){
            return (0);
        }
        else{
            ldepth = max_depth(node.left);
            rdepth = max_depth(node.right);

            return (Math.max(ldepth, rdepth) + 1);
        }
    }

    public int min_value(){
        return min_value(root);
    }

    private int min_value(Node node){
        Node current = node;
        while(current.left != null){
            current = current.left;
        }

        return current.data;
    }

    public void print_inorder(){
        return print_inorder(root);
    }

    private void print_inorder(Node node){
        if(node == null){
            return;
        }
        else{
            print_inorder(node.left);
            System.out.print(node.data);
            print_inorder(node.right);
        }
    }

    public void print_postorder(){
        return print_postorder(root);
    }

    private void print_postorder(Node node){
        if(node == null){
            return;
        }
        else{
            print_postorder(node.left);
            print_postorder(node.right);
            System.out.println(node.data);
        }
    }

    public boolean has_path_sum(int sum){
        return has_path_sum(root, sum);
    }

    private boolean has_path_sum(Node node, sum){
        // return true if sum == 0 and child node is null
        if(node == null){
            return (sum == 0);
        }
        else{
            int sub_sum = sum - node.data;
            reutrn(has_path_sum(node.left, sub_sum) || 
                   has_path_sum(node.right, sub_sum));
        }
    }

    public void mirror(){
        return mirror(root);
    }

    private void mirror(Node node){
        if(node != null){
            mirror(node.left);
            mirror(node.right);
            Node temp;
            node.left = temp;
            node.left = node.right;
            node.right = temp;
        }
    }
}