package patterns;
import java.util.*;
public class pat2 {
    public static void main(String[] args){
        System.out.println("reverse right le pattern print: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
