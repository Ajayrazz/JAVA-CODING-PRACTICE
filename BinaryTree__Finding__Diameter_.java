public class BinaryTree__Finding__Diameter_ {
    
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data;
            this.left = this.right = null ;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight)+1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftht = height(root.left);
        int rightht = height(root.right);
        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);

        int selfdiam = (leftdiam + rightdiam) + 1 ;

        return Math.max(selfdiam , Math.max(leftht , rightht));
    }

    //Printing the binary tree in inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Printing Binary Tree in Inorder Traversal -> ");
        inorder(root);
        System.out.println();

        System.out.println("Height of the Binary Tree -> " + height(root));
        System.out.println();

        System.out.println("Diameter of the binary tree -> " + diameter(root));
        
    }
}
