import java.util.*;
public class SHORTEST_PATH {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            
            //WEST
            if(dir == 'W'){
                x--;
            }
            //EAST
            else if(dir == 'E'){
                x++;
            }
            //NORTH
            else if(dir == 'N'){
                y++;
            }
            //SOUTH
            else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Shortest path : "+getShortestPath(str));

    }
}
