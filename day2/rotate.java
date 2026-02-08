package day2;

import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int temp=n;
        int cnt = 0;
        for (int i = 0; temp > 0; i++) {
            temp = temp / 10;
            cnt++;
        }
        System.out.println(cnt);
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= cnt; i++) {
            if (i <= r) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int q = n / div;
        int rem = n % div;
        int ans = rem * mul + q;
        System.out.println(ans);
    }
}