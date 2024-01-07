//program to find fibonacci series upto n term
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a);
		System.out.print(b);
		for(int i=1; i<=n-2; i++){
		    int s = a+b;
		    System.out.print(s);
		    a = b;
		    b = s;
		}
		
	}
}
