import java.util.*;
public class Trapping_Rainwater_Practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }

        //algorithm for trapped water
        //trappedwater = (waterlevel - height[i]) * width
        //waterlevel = min(leftmax boundary , rightmax boundary)

        //left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            height[i] = Math.max(leftmax[i-1] , height[i]);
        }

        //right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1] , height[i]);
        }

        int totalwater = 0;
        int width = 5;

        //calculate water
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            totalwater += (waterlevel - height[i]) * width;
        }


        System.out.println("Total amount of water stored between the bar -> " + totalwater);
    }
}
