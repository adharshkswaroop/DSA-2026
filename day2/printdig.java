package day2;

import java.util.*;

public class printdig {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            int q = n / div;
            System.out.print(q);

            n = n % div;
            div = div / 10;
        }
    }
}
