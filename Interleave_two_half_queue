import java.util.*;
public class Interleave_two_half_queue {
    public static void Interleave(Queue<Integer> s){
        Queue<Integer> r = new LinkedList<>();
        int size = s.size();
        for(int i=0; i<size/2; i++){
            r.add(s.remove());
        }

        while(!r.isEmpty()){
            s.add(r.remove());
            s.add(s.remove());
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

        Interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
