public class BinaryTree__Counting__Node {
    
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    //function for counting the number of nodes in a binary tree
    public static int countNodes(Node root){
        if(root == null){
            return 0 ;
        }
        int leftcount = countNodes(root.left) ;
        int rightcount = countNodes(root.right) ;

        return (leftcount + rightcount ) + 1 ;
    }


    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Total number of nodes in the binary tree -> " + countNodes(root)) ;
    }
}
