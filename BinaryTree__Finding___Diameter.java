public class BinaryTree__Finding___Diameter {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;

        }
    }
    
    //Function for finding the height of the binary tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1;
    }

    //Function for finding the height of the binary tree
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftht = height(root.left);
        int rightht = height(root.right);

        int leftdiam = diameter(root.left);
        int rightdiam = diameter(root.right);

        int selfdiam = (leftht + rightht + 1);

        return Math.max(selfdiam , Math.max(leftht , rightht));
    }

    //Printing the binary tree using pre-order traversal
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(80);
        root.right.right.right = new Node(99);

        preorder(root);
        System.out.println();
        System.out.println("Height of the given binary tree -> " + height(root));

        System.out.println("Diameter of the given binary tree -> " + diameter(root));
    }
}
