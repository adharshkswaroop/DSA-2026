package day1;
import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int count = 0;
            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}