import java.util.*;
public class Queue_Using_LinkedList {
    static class Node {
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
    
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //ADD
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //REMOVE
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front = head.data;
            //SINGLE ELEMENT
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        //PEEK()
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
