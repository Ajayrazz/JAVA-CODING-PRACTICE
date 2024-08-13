import java.util.*;
public class Max_Area_In_Histogram {
    public static void MaxArea (int height[]){
        int maxarea = 0;
        int nsl[] = new int[height.length];   //next small left
        int nsr[] = new int[height.length];   //next small right

        //NEXT SMALL RIGHT
        Stack<Integer> s = new Stack<>();
        for(int i=height.length-1; i>=0; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = height.length-1;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //NEXT SMALL LEFT
        s = new Stack<>();
        for(int i=0; i<height.length; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = -1;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //WIDTH = j-i-1
        //CURRENT AREA
        for(int i=0; i<height.length; i++){
            int HEIGHT = height[i];
            int width = nsr[i]-nsl[i]-1;
            int current_area = HEIGHT*width;
            maxarea = Math.max(current_area , maxarea);
        }

        System.out.println("Maximum area in histogram : "+maxarea);

    }
    public static void main(String args[]){
        int height[] = {2,1,5,6,2,3};
        MaxArea(height);
    }
}
