import java.util.Scanner;

public class DivisorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Number of integers

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int count = 0;

            // Count divisors using sqrt(x)
            for (int j = 1; j * j <= x; j++) {
                if (x % j == 0) {
                    count++; // j is a divisor
                    if (j != x / j) {
                        count++; // x/j is also a distinct divisor
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
