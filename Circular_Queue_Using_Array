import java.util.*;
public class Circular_Queue_Using_Array {
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue (int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        //CHECKING EMPTY
        public static boolean isEmpty(){
            return rear == -1;
        }
        //ADD
        public static void add(int data){
            if(rear == size-1){
                System.err.println("Queue is full.");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        //REMOVE
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int result = arr[front];
            //Last element delete
            if(rear == front){
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }
        //PEEK
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
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
