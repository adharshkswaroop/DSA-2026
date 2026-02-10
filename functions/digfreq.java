package functions;
import java.util.*;
public class digfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        System.out.print("enter target: ");
        int d = sc.nextInt();
        int f = getDigitFrequency(n,d);
        System.out.println("frequency:"+ f);
       
    }
    public static int getDigitFrequency(int n, int d){
        int rv=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(rem==d){
                rv++;
            }
        }
        return rv;
        
    }
}
