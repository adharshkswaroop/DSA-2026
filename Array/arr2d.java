import java.util.*;
public class arr2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                // System.out.println(arr[i][j]+"");
            }
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         // arr[i][j]=sc.nextInt();
        //         System.out.println(arr[i][j]+"");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(arr));
    }
}
