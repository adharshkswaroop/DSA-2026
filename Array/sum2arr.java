import java.util.*;
public class sum2arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<a1.length;i++) {
            a1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] a2=new int[m];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        
        int[] sum=new int[n>m? n:m];
        int c=0;

        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;
        while(k>=0){
            int d=c;
            if(i>=0){
                d+=a1[i];
            }
            if(j>=0){
                d+=a2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;
            i--;j--;k--;
        }
        if(c!=0){
            System.out.print(c);
        }
        for(int val:sum){
            System.out.print(val);
             
        }
        
    }
}

// public class ArraySumExample {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);


        // int n=sc.nextInt();
        // int[] array1 =new int[n];
        // for(int i=0;i<n;i++){
        //     array1[i]=sc.nextInt();
        // }
        
        // int m=sc.nextInt();
        // int[] array2 =new int[m];
        // for(int i=0;i<m;i++){
        //     array2[i]=sc.nextInt();
        // }

        // if (array1.length != array2.length) {
        //     System.out.println("Error: Arrays must have the same length to perform element-wise sum.");
        //     return;
        // }

        // int[] result = new int[array1.length];

        // for (int i = 0; i < array1.length; i++) {
        //     result[i] = array1[i] + array2[i];
        // }

        // System.out.println("Array 1: " + Arrays.toString(array1));
        // System.out.println("Array 2: " + Arrays.toString(array2));
        // System.out.println("Sum:     " + Arrays.toString(result));
//     }
// }
