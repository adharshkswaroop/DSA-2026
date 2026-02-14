package patterns;

import java.util.*;

public class pat1 {
    public static void main(String[] args) {
        System.out.println("right le triangle patter:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

// logic: Dry run/ memory diagram 
// 1. initilze the loops i, j 
// 2. outer i loop for rows 
// 3. inner j loop for coloums, it is responsible for no. of stars wanna print

