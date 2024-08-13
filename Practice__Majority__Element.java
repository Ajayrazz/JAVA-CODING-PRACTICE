//program to find the integer in the given array which appears more the n/3 times.

import java.util.*;
public class Practice__Majority__Element {
    public static void main(String args[]){
        int nums[] = {1,3,2,5,1,3,5,5,5,5,5,5};

        //algo
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i] , 1);
            }
        }

        Set<Integer> s = new HashSet<>();
        for(Integer key : s){
            if(hm.get(key) > nums.length/3){
                System.out.println("Majority Element -> " + key);
            }
        }
    }
}
