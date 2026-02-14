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
                // System.out.print(j);
            }
            System.out.println();
        }

    }
}

// logic: Dry run/ memory diagram 
// 1. initilze the loops i, j 
// 2. outer i loop for rows 
// 3. inner j loop for coloums, it is responsible for no. of stars wanna print