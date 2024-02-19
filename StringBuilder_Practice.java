public class StringBuilder_Practice {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char i='a'; i<='z'; i++){
            sb.append(i);
        }

        //print
        System.out.println(sb);
    }
}
