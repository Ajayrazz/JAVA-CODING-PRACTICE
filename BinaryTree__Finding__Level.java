public class BinaryTree__Finding__Level {
    
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = this.right = null ;
        }
    }

    //function for level order traversal
    public static void levelOrder(Node root , int level , int k){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        levelOrder(root.left , level + 1 , k);
        levelOrder(root.right, level + 1, k);
    }

    

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;

        levelOrder(root, 0, k);
    }
}
