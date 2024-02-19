import java.util.ArrayList;
public class ArrayList_Contains_Operation {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //Add Operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Contain Operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));
    }
}
