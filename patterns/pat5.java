package patterns;
import java.util.*;
public class pat5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sp=n/2;
        int str=1;
        for(int i=1;i<=n;i++){
            System.out.print(sp+","+str);
            // for(int j=1;j<=sp;j++){
            //     System.out.print("\t");
            // }
            // for(int j=1;j<=str;j++){
            //     System.out.print("*\t");
            // }
            if(i<=n/2){
                
                sp--;
                str+=2;  
            }
            else{
                sp++;
                str-=2;
            }
            System.out.println();
        }
    }
}

// logic: 
// 1. print the no. sequence ex(0,5 spaces=0 star=5  1,4   2,3  ) and convert into stars & spaces
// 2. mistakes done at looping os sp, str contition.
// 3. draw pattern & define them sp, str initialy

// mistakes: 1. before submiting the code, verify line by line
// 2.try to anaylize the memory diagram
