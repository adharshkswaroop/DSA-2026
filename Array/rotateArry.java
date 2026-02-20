import java.util.*;
public class rotateArry {
    
// Problem example: abcdef is a string, if i want to rotate str at 3 idx then abcdef changes to defabc

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int k =sc.nextInt();

        rotateArry ra=new rotateArry();
        System.out.println(ra.rotate(str, k));
       
    }
    public static void reverse(char[] a, int li, int ri) {
        while (li < ri) {
            char temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++; ri--;
        }
    }
    public static String rotate(String str, int k) {
        // if (str == null || str.isEmpty()) return str;
        char[] a = str.toCharArray(); //to change string to char and viceverse
        int n = a.length;
        k = k % n;
        if (k < 0) k += n;
        // part 1
        reverse(a, 0, k - 1);
        // part 2
        reverse(a, k, n - 1);
        // part 3
        reverse(a, 0, n - 1);
        return new String(a);
    }
}

