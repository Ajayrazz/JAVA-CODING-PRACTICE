public class BinaryTree__Finding__Diameter {
    
    static class node {
        int data;
        node left;
        node right;

        node(int data){
            this.left = this.right = null;
            this.data = data;
        }
    }

    //function for finding the height of binary tree
    public static int height(node root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1 ;
    }

    //Function for finding the Diameter of the binary tree
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int leftht = height(root.left);
        int rightht = height(root.right);
        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);

        int selfdiam = (leftht + rightht) + 1;

        return Math.max(selfdiam , Math.max(leftdiam , rightdiam)); 
    }

    //Program for printing binary tree in inorder traversal 
    public static void print(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }


    public static void main(String args[]){
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        root.left.left.left = new node(8);
        root.left.left.right = new node(9);
        root.left.left.left.left = new node(10);

        print(root);
        System.out.println();
        System.out.println("Height of the given binary tree -> " + height(root));
        System.out.println("Diameter of the given binary tree -> " + diameter(root));

    }
}
