public class BinaryTree_Finding_Diameter {
    
    static class Node {
        Node left ;
        Node right ;
        int data ;

        Node( int data ){
            this.data = data ;
            this.left = this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0 ;
        }

        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);

        int leftht = height(root.left);
        int rightht = height(root.right);

        int selfdiam = (leftht + rightht + 1);

        return Math.max(selfdiam , Math.max(leftdiam , rightdiam));
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
     
        System.out.println("Height of the given Binary Tree -> " + height(root));

        System.out.println("Diameter of the given Binary Tree -> " + diameter(root));
    }
}
