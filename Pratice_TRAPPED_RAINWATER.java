public class Pratice_TRAPPED_RAINWATER {
    public static int trapped_water (int height[] , int width) {
        //trapped water = (waterlevel - height of bar) * width
        //waterlevel = math.min(leftmaxboundary , rightmaxboundary);
        //leftmaxboundary = math.max(height[i] , leftmax[i-1])
        //rightmaxboundary = math.max(height[i] , rihtmax[i+1])

        //LEFT MAX BOUNDARY
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //RIGHT MAX BOUNDARY
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedwater = 0;

        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            trappedwater += (waterlevel - height[i]) * width;
        }

        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {5,7,9,2,4,3,6,1,7,0,9,0,0,9}; //height of each bar
        int width = 2; //width of bar

        System.out.println("Total amount of water stored between the bar : "+trapped_water(height, width));
    }
}