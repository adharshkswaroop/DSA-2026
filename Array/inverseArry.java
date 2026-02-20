import java.util.*;

public class inverseArry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        
        int[] inv = inverse(a);
        System.out.println(inv);
    }
    public static int[] inverse(int[] a){
        int[] inv=new int[a.length];
        
        for(int i=0;i<a.length;i++){
            int v=a[i];
            inv[v]=i;
        }
        return inv;
    }
}
