import java.util.*;

public class A_Multiplication_Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      // size of multiplication table (n x n)
        long x = sc.nextLong();    // number to find

        long count = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0) {
                long j = x / i;
                if (j <= n) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
