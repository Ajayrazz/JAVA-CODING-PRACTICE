import java.util.*;
public class Next_Greater_Element {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int next_greater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            if(!s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next_greater[i] = -1;
            } else {
                next_greater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<next_greater.length; i++){
            System.out.print(next_greater[i]+" ");
        }
        System.out.println();
    }
}
