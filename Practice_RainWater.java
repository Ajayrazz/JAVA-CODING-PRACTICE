import java.util.*;

public class Practice_RainWater {
    public static int calculating_trapped(int height[]) {
        // trapped water = (water level - height of bar) * width of bar
        // water level = min(left hand boundary, right hand bourndary)
        // left hand boundary = Math.max()
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
    }
}
