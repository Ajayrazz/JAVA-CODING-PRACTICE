public class Queue_Using_ArrayList {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        //constructor
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //isEmpty()
        public static boolean isEmpty(){
            return rear == -1;
        }

        //add element
        public static void add(int data){
            //base case
            if(rear == size-1){
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        //remove element
        public static int remove(){
            if(rear == -1){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        //peek() element
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(8);
        q.add(9);

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }
    }
}
