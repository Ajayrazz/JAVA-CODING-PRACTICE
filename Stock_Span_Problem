import java.util.*;
public class Stock_Span_Problem {

    public static void Span(int Stock[] , int Span[]){
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);
        for(int i=1; i<Stock.length; i++){
            int currPrice = Stock[i];
            while(!s.isEmpty() && currPrice > Stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                Span[i] = i+1;
            } else {
                int prevHigh = s.peek();
                Span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int Stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[Stock.length];
        Span(Stock, span);
        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }

    }
}
