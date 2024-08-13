import java.util.*;

public class Practice_Count_Distinct_Element {
    public static void main(String args[]){
        int nums[] = {1,5,2,6,2,2,1,4,1,4,5,9,9,93,21,5,1,2,54,9,9};

        //find count of distinct element
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        System.out.println("Total number of distinct element -> " + set.size());
    }
}
