public class BinaryTree_SubTree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node root , Node subtree){
        if(root == null || subtree == null){
            return true;
        }
        else if(root == null || subtree == null || root.data != subtree.data){
            return false;
        }

        if(!isIdentical(root.left, subtree.left)){
            return false;
        }
        if(!isIdentical(root.right, subtree.right)){
            return false;
        }
        return true;
    }
    
    public static boolean isSubtree(Node root , Node subtree){
        if(root == null){
            return false;
        }
        if(root.data == subtree.data){
            if(isIdentical(root, subtree)){
                return true;
            }
        }

        return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subtree = new Node(2);
        subtree.left = new Node(4);
        subtree.right = new Node(5);

        System.out.println(isSubtree(root, subtree));
    }
}
