import java.util.*;
public class Practice_TrappedRainWater_5 {
    public static int Total_water(int height[]){
        //trapped water = (water level - height of bar) * width of bar
        //water level = math.min(left hand boundary , right hand boundary)
        //left hand boundary = math.max(lefthand[i],height[i-1] , height[i])
        //right hand boundary = math.max(righthand[height.length-1],height[])
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height[] = {5,9,1,2,3,7,9,1,0,4,3,6,9};
    }
}
