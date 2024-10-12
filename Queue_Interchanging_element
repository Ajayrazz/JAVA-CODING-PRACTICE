import java.util.*;
public class Queue_Interchange {
    
    public static void interchange(Queue<Integer> q){
        Queue<Integer> new_q = new LinkedList<>();
        int size = q.size();

        //putting half element of q into new_q
        for(int i=0; i<size/2; i++){
            new_q.add(q.peek());
            q.remove();
        }

        //interchanging
        while(!new_q.isEmpty()){
            q.add(new_q.remove());
            q.add(q.remove());
        }
    }
    
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        //function calling
        interchange(q);

        //printing
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
