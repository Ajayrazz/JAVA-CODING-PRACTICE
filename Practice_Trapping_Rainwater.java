import java.util.*;
public class Practice_Trapping_Rainwater {
    
    public static int trapped(int height[]){
        //waterlevel = min(leftmax , rightmax)
        //trappedwater = (waterlevel - height[i])
        
        //lefft max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length-1; i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        //right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            height[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedwater = 0;

        for(int i=0; i <= height.length-1; i++){
            int waterlevel =    Math.min(leftmax[i] , rightmax[i]);
            trappedwater += (waterlevel - height[i]);
        }

        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println("Total amount of water trapped between the bar : " + trapped(height));
    }
}
