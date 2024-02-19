public class Practice_trappedRainwater {
    public static int trapped_water(int arr[]){
        //trapped water = (water level - bar height) * width of bar
        //water level = min(left max boundary, right max boundary)
        //left max boundary = max(left max[i-1],height[i]);
        //right max boundary = max(rightmax[height.length-1],height[height.length-2])

        //calculating left max boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        //calculating right max boundary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>0; i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int Total_Trapped_Water = 0;
        int width = 1;
        for(int i=0; i<arr.length; i++){
            int water_level = Math.min(leftMax[i],rightMax[i]);
            Total_Trapped_Water += (water_level - arr[i]) * width;
        }

        return Total_Trapped_Water;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Total amount of water trapped between the bar : "+trapped_water(height));
    }
}
