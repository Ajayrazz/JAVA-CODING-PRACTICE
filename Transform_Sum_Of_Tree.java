import java.util.*;
public class Transform_Sum_Of_Tree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    //function to convert sum binary tree
    public static Node sumTree(Node root){
        //base case
        if(root == null){
            return;
        }
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
