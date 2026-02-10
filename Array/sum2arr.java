import java.util.*;
public class sum2arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arrM=new int[n];
        int[] arrN=new int[m];
        for(int i=0;i<m && i<n;i++){
            arrM[i]=sc.nextInt();
            arrN[i]=sc.nextInt();
        }
        // int sum=arrM+arrN;
        System.out.println(Arrays.toString(arrM));
        
    }
}
