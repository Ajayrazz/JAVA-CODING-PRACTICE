public class BinaryTree__Finding__SumOfNodes {
    
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

    //function for finding the sum of nodes of the binary tree
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sumOfNodes(root.left) ;
        int rightsum = sumOfNodes(root.right) ;

        return (leftsum + rightsum + root.data) ;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2) ;
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Sum of nodes of binary tree -> " + sumOfNodes(root)) ;
    }
}
