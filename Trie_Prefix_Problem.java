public class Trie_Prefix_Problem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow;
        int freq;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            freq  = 1;
        }
    }

    public static Node root = new Node();

    //insert
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    public static void findPrefix(Node root , String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.print(ans +" ");
            return;
        }
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String args[]){
        String words[] = {"zebra" , "dog" , "duck" , "dove"};

        //insert
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        root.freq = -1;
        findPrefix(root, " ");
    }
}
