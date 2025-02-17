import java.util.LinkedList;

public class LinkedList_Create {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Method to addlement in linkedlist
    public void addFirst(int data){ // time complexity 0(1)
        //step1 -- create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2--- newNode next = head
        newNode.next = head; //link

        //step3---- head =- newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    //add element at a particular index
    public void add(int idx,int data){
        //base case
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //i=idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.add(2,9);
        System.out.print(ll);
        System.out.println();
        System.out.println(ll.size());


        

    }
}
