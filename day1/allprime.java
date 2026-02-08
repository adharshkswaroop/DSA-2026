package day1;
import java.util.*;

public class allprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int d = 2; d * d <= i; d++) {
                if (i % d == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}