public class BinaryTree__Finding__diameter__height__ {
    
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = this.right = null ;
        }
    }

    //function for finding the height of the binary tree
    public static int height(Node root){
        if(root == null){
            return 0 ;
        }

        int leftheight = height(root.left) ;
        int rightheight = height(root.right) ;

        return Math.max(leftheight , rightheight) + 1 ;
    }

    //function for finding the diameter of the binary tree
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftht = height(root.left) ;
        int rightht = height(root.right) ;

        int selfdiam = (leftht + rightht + 1) ;

        int leftdiam = diameter(root.left) ;
        int rightdiam = diameter(root.right) ;

        return Math.max(selfdiam , Math.max(leftdiam , rightdiam)) ;
    }

    //Function for printing the binary tree using inorder traversal
    public static void inorder(Node root){
        if(root == null){
            System.out.println("Empty Binary Tree.") ;
        }

        inorder(root.left);
        System.out.print(root.data + " " ) ;
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

        // System.out.println("Given Binary Tree -> ") ;
        // inorder(root);

        System.out.println("Height of the binary tree -> " + height(root)) ;

        System.out.println("Diameter of the binary tree -> " + diameter(root)) ;

    }
}
