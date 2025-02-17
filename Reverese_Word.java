import java.util.*;
public class Reverese_Word {
    
    //function for reversing string
    public static String reverse(String sentence){
        //case 1 : trim() for removing extra space
        sentence = sentence.trim();
        //create stack<String>
        Stack<String> stack = new Stack<>();
        //use for loop for iterating sentence
        int j = 0;
        for(int i=1; i<sentence.length(); i++){
            //base case
            if(sentence.charAt(i) == ' ' && sentence.charAt(i-1) != ' ') {
                 stack.push(sentence.substring(j,i).trim());
                 j = i+1;
            }
        }
        stack.push(sentence.substring(j));
        //creating StringBuilder 
        StringBuilder sb = new StringBuilder();
        //using while loop
        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String args[]){
        //input
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        //function recalling for reversing 
        String result = reverse(sentence);

        System.out.println("Reversed string : " + result);
    }
}
