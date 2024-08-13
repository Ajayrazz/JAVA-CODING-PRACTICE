import java.util.*;
public class BinaryTree__Finding__Height {
    
    static class node {
        int data;
        node left;
        node right;

        node(int data){
            this.left = this.right = null ;
            this.data = data;
        }
    }
    
    //function for finding the height of the binary tree

    public static int height(node root){
        if(root == null){
            return 1;
        }
        
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1;

    }
    public static void main(String args[]){
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        root.right.right.left = new node(8);
        root.right.right.left.right = new node(10);

        System.out.println("Height of the given binary tree -> "+ height(root));
    }
}
