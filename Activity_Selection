import java.util.*;
public class Activity_Selection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //first activity
        maxact = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxact++;
                ans.add(1);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum activities = "+maxact);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
