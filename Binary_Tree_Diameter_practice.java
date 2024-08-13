import java.util.*;

public class Binary_Tree_Diameter_practice {

    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public static int height(node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1;
    }
    
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int selfd = lh+rh+1;

        return Math.max(selfd , Math.max(leftdiam , rightdiam));

    }
    public static void main(String args[]){
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        System.out.println(diameter(root));
    }
}
