import java.util.*;
public class Queue_Reversal {
    public static void PrintReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        PrintReversal(q);
        while(!q.isEmpty()){
            System.err.print(q.peek()+" ");
            q.remove();
        }
    }
}
