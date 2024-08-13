import java.util.*;
public class Practice____Trapping____Water {
    
    public static int trapped(int height[]){
        //trappedwater = (waterlevel - height[i]) * width
        //waterlevel = min(leftmax boundary , rightmax boundary)
        
        //leftmax boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        //rightmax boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1] , height[i]);
        }

        int totalwater = 0;
        int width = 2;            // width of each bar

        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            totalwater += (waterlevel - height[i]) * width;
        }

        return totalwater ;
    }
    public static void main(String args[]){
        int height[] = {5,9,4,8,3,6,4,7,9,1,0,1,0,8,0,9,12};

        System.out.println("Total amount of water stored -> " + trapped(height));
    }
}
