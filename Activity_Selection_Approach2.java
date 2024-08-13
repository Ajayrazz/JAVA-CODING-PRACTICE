import java.util.*;
public class Activity_Selection_Approach2 {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function for sorting
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));

        //end time basic sorting
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        //first activity
        maxact = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=0; i<end.length; i++){
            if(activities[i][1] > lastEnd){
                maxact++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum activities = "+maxact);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
