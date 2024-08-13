import java.util.*;
public class Queue_LinkedList {
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

        //IsEmpty()
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }
        //remove()
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front = head.data;
            //Single Element
            if(head == tail){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        //Peek Element
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
